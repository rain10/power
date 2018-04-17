package org.arain.power.system.config.mybatis;

import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;

@Configuration
public class DruidConfig {
	
    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
    	return  new DruidStatInterceptor();
    }
    
    @Bean
    public JdkRegexpMethodPointcut jdkRegexpMethodPointcut() {
    	JdkRegexpMethodPointcut jdkRegexpMethodPointcut = new JdkRegexpMethodPointcut();
    	jdkRegexpMethodPointcut.setPatterns("org.arain.power..*");
    	return jdkRegexpMethodPointcut;
    }
    
    @Bean
    public Advisor druidAdvisor() {
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
        defaultPointcutAdvisor.setPointcut(jdkRegexpMethodPointcut());
        defaultPointcutAdvisor.setAdvice(druidStatInterceptor());
        return defaultPointcutAdvisor;
    }
}
