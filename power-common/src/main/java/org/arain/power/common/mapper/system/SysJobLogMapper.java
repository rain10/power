package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysJobLog;
import org.arain.power.common.pojo.system.SysJobLogExample;

public interface SysJobLogMapper {
    int countByExample(SysJobLogExample example);

    int deleteByExample(SysJobLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysJobLog record);

    int insertSelective(SysJobLog record);

    List<SysJobLog> selectByExample(SysJobLogExample example);

    SysJobLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByExample(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByPrimaryKeySelective(SysJobLog record);

    int updateByPrimaryKey(SysJobLog record);
}