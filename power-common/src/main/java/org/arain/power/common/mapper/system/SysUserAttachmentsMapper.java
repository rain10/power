package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysUserAttachmentsExample;
import org.arain.power.common.pojo.system.SysUserAttachmentsKey;

public interface SysUserAttachmentsMapper {
    int countByExample(SysUserAttachmentsExample example);

    int deleteByExample(SysUserAttachmentsExample example);

    int deleteByPrimaryKey(SysUserAttachmentsKey key);

    int insert(SysUserAttachmentsKey record);

    int insertSelective(SysUserAttachmentsKey record);

    List<SysUserAttachmentsKey> selectByExample(SysUserAttachmentsExample example);

    int updateByExampleSelective(@Param("record") SysUserAttachmentsKey record, @Param("example") SysUserAttachmentsExample example);

    int updateByExample(@Param("record") SysUserAttachmentsKey record, @Param("example") SysUserAttachmentsExample example);
}