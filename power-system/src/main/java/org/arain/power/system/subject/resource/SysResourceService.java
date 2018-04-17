package org.arain.power.system.subject.resource;

import javax.servlet.http.HttpServletRequest;

import org.arain.power.common.utils.ResultMap;
import org.arain.power.system.base.BaseService;

public interface SysResourceService extends BaseService{

	String loadData();

	String load_tree(HttpServletRequest request);

	ResultMap save(SysResourceDto dto);

	SysResourceDto load(SysResourceDto dto);

}
