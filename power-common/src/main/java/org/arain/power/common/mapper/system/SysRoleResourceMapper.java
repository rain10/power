package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysRoleResource;
import org.arain.power.common.pojo.system.SysRoleResourceExample;
import org.arain.power.common.pojo.system.SysRoleResourceKey;

public interface SysRoleResourceMapper {
    int countByExample(SysRoleResourceExample example);

    int deleteByExample(SysRoleResourceExample example);

    int deleteByPrimaryKey(SysRoleResourceKey key);

    int insert(SysRoleResource record);

    int insertSelective(SysRoleResource record);

    List<SysRoleResource> selectByExample(SysRoleResourceExample example);

    SysRoleResource selectByPrimaryKey(SysRoleResourceKey key);

    int updateByExampleSelective(@Param("record") SysRoleResource record, @Param("example") SysRoleResourceExample example);

    int updateByExample(@Param("record") SysRoleResource record, @Param("example") SysRoleResourceExample example);

    int updateByPrimaryKeySelective(SysRoleResource record);

    int updateByPrimaryKey(SysRoleResource record);
}