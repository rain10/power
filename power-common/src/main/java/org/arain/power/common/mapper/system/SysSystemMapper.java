package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysSystem;
import org.arain.power.common.pojo.system.SysSystemExample;

public interface SysSystemMapper {
    int countByExample(SysSystemExample example);

    int deleteByExample(SysSystemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysSystem record);

    int insertSelective(SysSystem record);

    List<SysSystem> selectByExample(SysSystemExample example);

    SysSystem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysSystem record, @Param("example") SysSystemExample example);

    int updateByExample(@Param("record") SysSystem record, @Param("example") SysSystemExample example);

    int updateByPrimaryKeySelective(SysSystem record);

    int updateByPrimaryKey(SysSystem record);
}