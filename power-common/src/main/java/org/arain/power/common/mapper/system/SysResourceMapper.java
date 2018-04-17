package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysResource;
import org.arain.power.common.pojo.system.SysResourceExample;

public interface SysResourceMapper {
    int countByExample(SysResourceExample example);

    int deleteByExample(SysResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    List<SysResource> selectByExample(SysResourceExample example);

    SysResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByExample(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);

	List<SysResource> selectByUserId(long pid,long userId);
}