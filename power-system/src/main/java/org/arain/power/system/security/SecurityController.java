package org.arain.power.system.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.arain.power.common.exception.UseException;
import org.arain.power.common.pojo.system.SysUser;
import org.arain.power.common.utils.MD5Utils;
import org.arain.power.common.utils.ResultMap;
import org.arain.power.system.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("system")
public class SecurityController extends BaseController{
	
	@Autowired
	private SecurityService securityService;
	
	@RequestMapping("login")
	public String loginPage() {
		return "login/login";
	}
	
	@RequestMapping("login.do")
	@ResponseBody
	public ResultMap loginDo(SecurityDto dto,HttpServletRequest request,HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(dto.getUsername(),MD5Utils.MD5_Simple(dto.getPassword()));
		try {
			subject.login(token);
			SysUser user = (SysUser) subject.getPrincipal();
			user.setPassword("");
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", user);
			session.setMaxInactiveInterval(30 * 60);
			return ResultMap.ok();
		} catch (Exception e) {
			throw new UseException(e.getMessage());
		}
	}
	
	@RequestMapping("index")
	public String index(HttpServletRequest request,HttpServletResponse response,Model model) {
		model.addAttribute("menus", securityService.loadNav(0));
		return "login/index";
	}
	
	@RequestMapping("loadNav.do/{pid}")
	@ResponseBody
	public String index(@PathVariable long pid,HttpServletRequest request,HttpServletResponse response) {
		return securityService.loadNavByPid(pid);
	}
}
