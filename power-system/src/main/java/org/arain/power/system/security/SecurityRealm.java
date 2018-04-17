package org.arain.power.system.security;

import java.util.Collection;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.arain.power.common.exception.UseException;
import org.arain.power.common.pojo.system.SysUser;
import org.arain.power.common.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 
* <p>Title:SampleRealm </p>
* @author Arain
* @date2017年6月29日
 */
@Component
public class SecurityRealm extends AuthorizingRealm {
	@Autowired
	private SecurityService securityService;
	@Autowired
	private SessionDAO sessionDAO;
	
	public SecurityRealm() {
		super();
	}
	/**
	 *  认证信息，主要针对用户登录， 
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		String userName = (String)authcToken.getPrincipal();
		UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
		SecurityDto dto = new SecurityDto();
		dto.setUsername(token.getUsername());
		dto.setPassword(String.valueOf(token.getPassword()));
		//apache shiro获取所有在线用户  
        Collection<Session> sessions = sessionDAO.getActiveSessions();  
        for(Session session:sessions){  
            SimplePrincipalCollection attribute = (SimplePrincipalCollection) session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);//获得session中已经登录用户的名字  
            if(attribute!=null) {
            	 SysUser user = (SysUser) attribute.getPrimaryPrincipal();
                 if(userName.equals(user.getUsername())){  //这里的username也就是当前登录的username  
                   session.setTimeout(0);  //这里就把session清除，
               }  
            }
        }  
		ResultMap map = securityService.login(dto);
		Integer code = map.getCode();
		if(code == 400) {
			throw  new org.apache.shiro.authc.AuthenticationException("账号或密码错误");
		}
		if(code == 401) {
			throw new org.apache.shiro.authc.LockedAccountException("账号处于锁定中");
		}
		SysUser user = (SysUser) map.getData();
		return new SimpleAuthenticationInfo(user,user.getPassword(), getName());
    }

	 /** 
     * 授权 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    	return null;
    }  
    /**
     * 清空当前用户权限信息
     */
	public  void clearCachedAuthorizationInfo() {
		PrincipalCollection principalCollection = SecurityUtils.getSubject().getPrincipals();
		SimplePrincipalCollection principals = new SimplePrincipalCollection(
				principalCollection, getName());
		super.clearCachedAuthorizationInfo(principals);
	}
	/**
	 * 指定principalCollection 清除
	 */
	public void clearCachedAuthorizationInfo(PrincipalCollection principalCollection) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(
				principalCollection, getName());
		super.clearCachedAuthorizationInfo(principals);
	}
}
