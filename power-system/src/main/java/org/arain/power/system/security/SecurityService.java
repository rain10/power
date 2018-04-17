package org.arain.power.system.security;

import java.util.List;

import org.arain.power.common.pojo.system.SysResource;
import org.arain.power.common.utils.ResultMap;
import org.arain.power.system.base.BaseService;

public interface SecurityService extends BaseService{
	ResultMap login(SecurityDto dto);

	String loadNavByPid(long pid);

	List<SysResource> loadNav(long pid);
}
