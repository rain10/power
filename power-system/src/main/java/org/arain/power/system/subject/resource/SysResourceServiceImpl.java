package org.arain.power.system.subject.resource;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.arain.power.common.mapper.system.SysResourceMapper;
import org.arain.power.common.mapper.system.SysRoleResourceMapper;
import org.arain.power.common.pojo.system.SysResource;
import org.arain.power.common.pojo.system.SysResourceExample;
import org.arain.power.common.pojo.system.SysRoleResource;
import org.arain.power.common.utils.AppUtils;
import org.arain.power.common.utils.CommonContains;
import org.arain.power.common.utils.IDUtil;
import org.arain.power.common.utils.ResultMap;
import org.arain.power.system.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author Arain
 *
 */
@Service
public class SysResourceServiceImpl extends BaseServiceImpl implements SysResourceService{
	@Autowired
	private SysResourceMapper sysResourceMapper;
	
	private Long admin = (long) 1;
	@Autowired 
	private SysRoleResourceMapper sysRoleResourceMapper;
	
	@Override
	public String loadData() {

		JSONArray array = new JSONArray();
		SysResourceExample example = new SysResourceExample();
		example.createCriteria().andPidEqualTo((long) 0);
		List<SysResource> list = sysResourceMapper.selectByExample(example);
		int countByExample = sysResourceMapper.countByExample(example);
		for (SysResource sysResource : list) {
			JSONArray child = new JSONArray();
			JSONObject object = new JSONObject();
			object.put("id",sysResource.getId());
			object.put("name",sysResource.getName());
			object.put("type","菜单");
			object.put("sort",sysResource.getSort());
			object.put("url",sysResource.getUrl());
			object.put("icon","<i class='iconfont'>"+sysResource.getIcon()+"</i>");
			object.put("enabled", sysResource.getEnabled());
			
			SysResourceExample childexample = new SysResourceExample();
			childexample.createCriteria().andPidEqualTo(sysResource.getId());
			List<SysResource> childlist = sysResourceMapper.selectByExample(childexample);
			for (SysResource sysResourceChild : childlist) {
				JSONObject objectChild = new JSONObject();
				objectChild.put("id",sysResourceChild.getId());
				objectChild.put("name",sysResourceChild.getName());
				objectChild.put("type","模块");
				objectChild.put("sort",sysResourceChild.getSort());
				objectChild.put("url",sysResourceChild.getUrl());
				objectChild.put("icon","<i class='iconfont'>"+sysResourceChild.getIcon()+"</i>");
				objectChild.put("enabled", sysResourceChild.getEnabled());
				
				child.add(objectChild);
			}
			object.put("children",child);
			array.add(object);
		}
		
		JSONObject result = new JSONObject();
		result.put("total",countByExample);
		result.put("rows", array);
		return result.toString();
	
	}

	@Override
	public String load_tree(HttpServletRequest request) {
		JSONArray array = new JSONArray();
		JSONObject object_top = new JSONObject();
		object_top.put("id", 0);
		object_top.put("text","顶级菜单");
		object_top.put("state","open");
		List<SysResource> list = sysResourceMapper.selectByUserId((long) 0, AppUtils.getUserId());
		for (SysResource sysResource : list) {
			JSONObject object = new JSONObject();
			object.put("id", sysResource.getId());
			object.put("text", sysResource.getName());
			object.put("state","closed");
			
			JSONArray childArray = new JSONArray();
			List<SysResource> childList = sysResourceMapper.selectByUserId(sysResource.getId(), AppUtils.getUserId());
			for (SysResource sysResourceChild : childList) {
				JSONObject objectChild = new JSONObject();
				objectChild.put("id", sysResourceChild.getId());
				objectChild.put("text", sysResourceChild.getName());
				objectChild.put("state","open");
				
				childArray.add(objectChild);
			}
			if(childArray.size() > 0) {
				object.put("state","closed");
			} else {
				object.put("state","open");
			}
			object.put("children", childArray);
			array.add(object);
		}
		object_top.put("children", array);
		JSONArray array_top = new JSONArray();
		array_top.add(object_top);
		return array_top.toString();
	}

	@Override
	public ResultMap save(SysResourceDto dto) {
		net.sf.json.JSONArray resourceJsons=net.sf.json.JSONArray.fromObject(dto.getResourcesJson());
		if(StringUtils.isBlank(dto.getPid())) {
			dto.setPid("0");
		}
		if(StringUtils.isNotBlank(dto.getId())) {
			SysResource resource = sysResourceMapper.selectByPrimaryKey(Long.valueOf(dto.getId()));
			AppUtils.copyProperties(resource, dto);
			sysResourceMapper.updateByPrimaryKey(resource);
			
			SysRoleResource record = new SysRoleResource();
			record.setRoleId(admin);
			record.setChecked((short) 1);
			record.setResourceId(resource.getId());
			
			SysResourceExample example = new SysResourceExample();
			example.createCriteria().andPidEqualTo(resource.getId()).andHavemuneEqualTo((short) 0);
			sysResourceMapper.deleteByExample(example);
			
			List<SysResource> sysResourceDtos=(List<SysResource>) net.sf.json.JSONArray.toCollection(resourceJsons, SysResource.class);
			for (SysResource sysResource : sysResourceDtos) {
				sysResource.setEnabled(resource.getEnabled());
				sysResource.setPid(resource.getId());
				sysResourceMapper.insert(sysResource);
				
				SysRoleResource record_child = new SysRoleResource();
				record_child.setRoleId(admin);
				record_child.setChecked((short) 0);
				record_child.setResourceId(sysResource.getId());
				sysRoleResourceMapper.insert(record_child);
				
			}
			return ResultMap.ok();
			
		} else {
			dto.setId(IDUtil.genId());
			SysResource resource = new SysResource();
			AppUtils.copyProperties(resource, dto);
			sysResourceMapper.insert(resource);
			SysRoleResource record = new SysRoleResource();
			record.setRoleId(admin);
			record.setChecked((short) 1);
			record.setResourceId(resource.getId());
			
			sysRoleResourceMapper.insert(record);
			List<SysResource> sysResourceDtos=(List<SysResource>) net.sf.json.JSONArray.toCollection(resourceJsons, SysResource.class);
			for (SysResource sysResource : sysResourceDtos) {
				sysResource.setEnabled(resource.getEnabled());
				sysResource.setPid(resource.getId());
				sysResourceMapper.insert(sysResource);
				
				SysRoleResource record_child = new SysRoleResource();
				record_child.setRoleId(admin);
				record_child.setChecked((short) 0);
				record_child.setResourceId(sysResource.getId());
				sysRoleResourceMapper.insert(record);
			}
			return ResultMap.ok();
		}
	}

	@Override
	public SysResourceDto load(SysResourceDto dto) {
		SysResource resource = sysResourceMapper.selectByPrimaryKey(Long.valueOf(dto.getId()));
		AppUtils.copyProperties(dto, resource);
		return dto;
	}

}
