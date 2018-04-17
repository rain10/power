package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysLogHandle;
import org.arain.power.common.pojo.system.SysLogHandleExample;

public interface SysLogHandleMapper {
    int countByExample(SysLogHandleExample example);

    int deleteByExample(SysLogHandleExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(SysLogHandle record);

    int insertSelective(SysLogHandle record);

    List<SysLogHandle> selectByExampleWithBLOBs(SysLogHandleExample example);

    List<SysLogHandle> selectByExample(SysLogHandleExample example);

    SysLogHandle selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") SysLogHandle record, @Param("example") SysLogHandleExample example);

    int updateByExampleWithBLOBs(@Param("record") SysLogHandle record, @Param("example") SysLogHandleExample example);

    int updateByExample(@Param("record") SysLogHandle record, @Param("example") SysLogHandleExample example);

    int updateByPrimaryKeySelective(SysLogHandle record);

    int updateByPrimaryKeyWithBLOBs(SysLogHandle record);

    int updateByPrimaryKey(SysLogHandle record);
}