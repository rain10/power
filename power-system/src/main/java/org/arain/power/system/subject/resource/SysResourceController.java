package org.arain.power.system.subject.resource;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.arain.power.common.exception.UseException;
import org.arain.power.common.utils.AppUtils;
import org.arain.power.common.utils.ResultMap;
import org.arain.power.system.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Arain
 *
 */

@Controller
@RequestMapping("sys/resource")
public class SysResourceController extends BaseController{
	@Autowired
	private SysResourceService sysResourceService;
	
	@RequestMapping("list")
	public String listPage() {
		return "subject/resource/list";
	}
	
	@RequestMapping("loadData.do")
	@ResponseBody
	public String listData() {
		return sysResourceService.loadData();
	}
	
	@RequestMapping("add")
	public String addPage(Model model,SysResourceDto dto) {
		model.addAttribute("icons", AppUtils.load_icons());
		model.addAttribute("sysResource", dto);
		return "subject/resource/add";
	}
	
	@RequestMapping("edit")
	public String editPage(Model model,SysResourceDto dto) {
		model.addAttribute("icons", AppUtils.load_icons());
		dto = sysResourceService.load(dto);
		model.addAttribute("sysResource", dto);
		return "subject/resource/add";
	}
	
	@RequestMapping(value="load_tree.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String load_tree(HttpServletRequest request) {
		return sysResourceService.load_tree(request);
	}
	
	@RequestMapping(value="save.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public ResultMap save(HttpServletRequest request,SysResourceDto dto) {
		if((StringUtils.isBlank(dto.getPid()) || "0".equals(dto.getPid()))&& (StringUtils.isBlank(dto.getResourcesJson()) || !"[]".equals(dto.getResourcesJson()) )) {
			throw new UseException("菜单模块不允许添加功能配置");
		}
		return sysResourceService.save(dto);
	}
}
