package org.arain.power.system.config.mybatis;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource(value={"db.properties","resources.properties"})
@ComponentScan(basePackages="org.arain.power")
public class DataSourceConfig {
	@Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driver}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;
    
    @Bean(destroyMethod="close")
    public DataSource dataSource () {
    	DruidDataSource druidDataSource = new DruidDataSource();
    	druidDataSource.setUrl(jdbcUrl);
    	druidDataSource.setDriverClassName(jdbcDriverClassName);
    	druidDataSource.setUsername(jdbcUsername);
    	druidDataSource.setPassword(jdbcPassword);
    	druidDataSource.setMaxActive(10);
    	druidDataSource.setMinIdle(5);
    	//监控
    	try {
    		druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        	druidDataSource.setMinEvictableIdleTimeMillis(30000);
        	druidDataSource.setValidationQuery("SELECT 1 FROM DUAL");
        	druidDataSource.setTestWhileIdle(true);
        	druidDataSource.setTestOnBorrow(false);
        	druidDataSource.setTestOnReturn(false);
        	druidDataSource.setPoolPreparedStatements(true);
        	druidDataSource.setMaxOpenPreparedStatements(20);
			druidDataSource.setFilters("stat,wall,log4j");
			druidDataSource.setConnectionProperties("ruid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000");
			druidDataSource.setUseGloalDataSourceStat(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return druidDataSource;
    }
}
