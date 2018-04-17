package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysAttachments;
import org.arain.power.common.pojo.system.SysAttachmentsExample;

public interface SysAttachmentsMapper {
    int countByExample(SysAttachmentsExample example);

    int deleteByExample(SysAttachmentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAttachments record);

    int insertSelective(SysAttachments record);

    List<SysAttachments> selectByExample(SysAttachmentsExample example);

    SysAttachments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAttachments record, @Param("example") SysAttachmentsExample example);

    int updateByExample(@Param("record") SysAttachments record, @Param("example") SysAttachmentsExample example);

    int updateByPrimaryKeySelective(SysAttachments record);

    int updateByPrimaryKey(SysAttachments record);
}