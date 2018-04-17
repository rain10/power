package org.arain.power.system.security;

import java.util.List;

import org.arain.power.common.mapper.system.SysResourceMapper;
import org.arain.power.common.mapper.system.SysUserMapper;
import org.arain.power.common.pojo.system.SysResource;
import org.arain.power.common.pojo.system.SysUser;
import org.arain.power.common.pojo.system.SysUserExample;
import org.arain.power.common.utils.AppUtils;
import org.arain.power.common.utils.ResultMap;
import org.arain.power.system.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author Arain
 *
 */
@Service
public class SecurityServiceImpl extends BaseServiceImpl implements SecurityService {
	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	private SysResourceMapper sysResourceMapper;

	@Override
	public ResultMap login(SecurityDto dto) {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andUsernameEqualTo(dto.getUsername()).andPasswordEqualTo(dto.getPassword())
				.andEnabledEqualTo((short) 1);
		List<SysUser> list = sysUserMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			if (list.get(0).getLocked() == 0) {
				return ResultMap.build(401, "账号处于锁定中");
			}
			return ResultMap.ok(list.get(0));
		}
		return ResultMap.build(400, "账号或密码错误");
	}

	@Override
	public String loadNavByPid(long pid) {
		Long userId = AppUtils.getUserId();
		JSONArray data = new JSONArray();
		List<SysResource> list_p = sysResourceMapper.selectByUserId(pid, userId);
		for (SysResource sysResource : list_p) {
			JSONObject object = new JSONObject();
			object.put("pid", sysResource.getPid());
			object.put("name", sysResource.getName());
			object.put("id", sysResource.getId());
			object.put("url", sysResource.getUrl());
			object.put("icon", sysResource.getIcon());
			
			data.add(object);
		}
		return data.toString();
	}

	@Override
	public List<SysResource> loadNav(long pid) {
		Long userId = AppUtils.getUserId();
		List<SysResource> list = sysResourceMapper.selectByUserId(pid,userId);
		return list;		
	}

}
