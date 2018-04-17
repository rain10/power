package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysGroup;
import org.arain.power.common.pojo.system.SysGroupExample;

public interface SysGroupMapper {
    int countByExample(SysGroupExample example);

    int deleteByExample(SysGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysGroup record);

    int insertSelective(SysGroup record);

    List<SysGroup> selectByExample(SysGroupExample example);

    SysGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysGroup record, @Param("example") SysGroupExample example);

    int updateByExample(@Param("record") SysGroup record, @Param("example") SysGroupExample example);

    int updateByPrimaryKeySelective(SysGroup record);

    int updateByPrimaryKey(SysGroup record);
}