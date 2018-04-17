package org.arain.power.eureka.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class FilterConfig {
		
	@Bean
	public Filter webRequestLoggingFilter() {
	    return new CommonsRequestLoggingFilter();
	}
}
