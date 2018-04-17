package org.arain.power.system.config.shiro;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.eis.MemorySessionDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.arain.power.system.security.SecurityRealm;
import org.arain.power.system.security.SecurityService;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * 
 * @author Arain
 *
 */
@Configuration
public class ShiroConfig {
	public static final String PREMISSION_STRING = "perms[\"{0}\"]";

	@Bean("shiroFilter")
	@ConditionalOnMissingBean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager,
			SecurityService securityService) {

		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		shiroFilterFactoryBean.setSuccessUrl("/system/index");
		shiroFilterFactoryBean.setLoginUrl("/system/login");
		shiroFilterFactoryBean.setUnauthorizedUrl("/system/error.do");
		Map<String, String> filterChainDefinitionMap = new HashMap<String, String>();
		filterChainDefinitionMap.put("/system/login.do", "anon");
		filterChainDefinitionMap.put("/system/logout", "logout");
		filterChainDefinitionMap.put("/login/**", "anon");
		filterChainDefinitionMap.put("/power/**", "anon");
		filterChainDefinitionMap.put("/**", "authc");

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

		return shiroFilterFactoryBean;
	}

	/**
	 * shiro注解
	 * 
	 * @param securityManager
	 * @return
	 */
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
		return authorizationAttributeSourceAdvisor;
	}

	/**
	 * 保证实现了Shiro内部lifecycle函数的bean执行
	 * 
	 * @return
	 */
	@Bean(name = "lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	/**
	 * AOP式方法级权限检查
	 * 
	 * @return
	 */
	@Bean
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
		daap.setProxyTargetClass(true);
		return daap;
	}

	@Bean
	public EhCacheManager ehCacheManager() {
		EhCacheManager cacheManager = new EhCacheManager();
		cacheManager.setCacheManagerConfigFile("classpath:ehcache-setting.xml");
		return cacheManager;
	}

	@Bean(name = "securityManager")
	public DefaultWebSecurityManager securityManager(EhCacheManager cacheManager,
			DefaultWebSessionManager sessionManager) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(simpleRealm());
		securityManager.setCacheManager(cacheManager);
		securityManager.setSessionManager(sessionManager);
		return securityManager;
	}

	@Bean(name = "shiroRealm")
	@DependsOn("lifecycleBeanPostProcessor")
	public SecurityRealm simpleRealm() {
		SecurityRealm securityRealm = new SecurityRealm();
		return securityRealm;
	}

	@Bean(name = "sessionDAO")
	public MemorySessionDAO memorySessionDAO() {
		MemorySessionDAO sessionDAO = new MemorySessionDAO();
		return sessionDAO;
	}

	@Bean(name = "sessionManager")
	public DefaultWebSessionManager defaultWebSessionManager(MemorySessionDAO sessionDAO,
			SimpleCookie sessionIdCookie) {
		DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
		defaultWebSessionManager.setSessionDAO(sessionDAO);
		defaultWebSessionManager.setSessionIdCookie(sessionIdCookie);
		defaultWebSessionManager.setGlobalSessionTimeout(1800000);
		defaultWebSessionManager.setDeleteInvalidSessions(true);
		defaultWebSessionManager.setSessionValidationSchedulerEnabled(true);
		defaultWebSessionManager.setSessionValidationInterval(1800000);
		return defaultWebSessionManager;
	}

	@Bean(name = "sessionIdCookie")
	public SimpleCookie simpleCookie() {
		SimpleCookie cookie = new SimpleCookie();
		cookie.setName("ARAINJSESSID");
		return cookie;
	}
}
