package org.arain.power.system.config.mybatis;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class MybatisConfig {
	@Autowired
	private DataSource dataSource;
	
	@Bean
	@ConditionalOnMissingBean
	public SqlSessionFactoryBean sessionFactoryBean() {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resource = resolver.getResource("classpath:mybatis/sqlMapConfig.xml");
		sessionFactoryBean.setConfigLocation(resource);
		
		sessionFactoryBean.setTypeAliasesPackage("org.arain.power.common.pojo.system");
		return sessionFactoryBean;
	}
}
