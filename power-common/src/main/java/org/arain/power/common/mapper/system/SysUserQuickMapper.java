package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysUserQuick;
import org.arain.power.common.pojo.system.SysUserQuickExample;
import org.arain.power.common.pojo.system.SysUserQuickKey;

public interface SysUserQuickMapper {
    int countByExample(SysUserQuickExample example);

    int deleteByExample(SysUserQuickExample example);

    int deleteByPrimaryKey(SysUserQuickKey key);

    int insert(SysUserQuick record);

    int insertSelective(SysUserQuick record);

    List<SysUserQuick> selectByExample(SysUserQuickExample example);

    SysUserQuick selectByPrimaryKey(SysUserQuickKey key);

    int updateByExampleSelective(@Param("record") SysUserQuick record, @Param("example") SysUserQuickExample example);

    int updateByExample(@Param("record") SysUserQuick record, @Param("example") SysUserQuickExample example);

    int updateByPrimaryKeySelective(SysUserQuick record);

    int updateByPrimaryKey(SysUserQuick record);
}