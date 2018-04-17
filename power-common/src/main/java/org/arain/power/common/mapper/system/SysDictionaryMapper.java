package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysDictionary;
import org.arain.power.common.pojo.system.SysDictionaryExample;
import org.arain.power.common.pojo.system.SysDictionaryKey;

public interface SysDictionaryMapper {
    int countByExample(SysDictionaryExample example);

    int deleteByExample(SysDictionaryExample example);

    int deleteByPrimaryKey(SysDictionaryKey key);

    int insert(SysDictionary record);

    int insertSelective(SysDictionary record);

    List<SysDictionary> selectByExample(SysDictionaryExample example);

    SysDictionary selectByPrimaryKey(SysDictionaryKey key);

    int updateByExampleSelective(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByExample(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByPrimaryKeySelective(SysDictionary record);

    int updateByPrimaryKey(SysDictionary record);
}