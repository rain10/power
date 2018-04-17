package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysLogLogin;
import org.arain.power.common.pojo.system.SysLogLoginExample;

public interface SysLogLoginMapper {
    int countByExample(SysLogLoginExample example);

    int deleteByExample(SysLogLoginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLogLogin record);

    int insertSelective(SysLogLogin record);

    List<SysLogLogin> selectByExample(SysLogLoginExample example);

    SysLogLogin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysLogLogin record, @Param("example") SysLogLoginExample example);

    int updateByExample(@Param("record") SysLogLogin record, @Param("example") SysLogLoginExample example);

    int updateByPrimaryKeySelective(SysLogLogin record);

    int updateByPrimaryKey(SysLogLogin record);
}