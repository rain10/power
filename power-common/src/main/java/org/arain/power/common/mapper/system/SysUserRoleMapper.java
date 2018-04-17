package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysUserRoleExample;
import org.arain.power.common.pojo.system.SysUserRoleKey;

public interface SysUserRoleMapper {
    int countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRoleKey record);

    int insertSelective(SysUserRoleKey record);

    List<SysUserRoleKey> selectByExample(SysUserRoleExample example);

    int updateByExampleSelective(@Param("record") SysUserRoleKey record, @Param("example") SysUserRoleExample example);

    int updateByExample(@Param("record") SysUserRoleKey record, @Param("example") SysUserRoleExample example);
}