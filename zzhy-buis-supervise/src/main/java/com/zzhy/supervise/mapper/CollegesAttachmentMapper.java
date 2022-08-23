package com.zzhy.supervise.mapper;

import java.util.List;
import com.zzhy.supervise.domain.CollegesAttachment;

/**
 * 院校端申报通用附件Mapper接口
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public interface CollegesAttachmentMapper 
{
    /**
     * 查询院校端申报通用附件
     * 
     * @param attachmentId 院校端申报通用附件主键
     * @return 院校端申报通用附件
     */
    public CollegesAttachment selectCollegesAttachmentByAttachmentId(Long attachmentId);

    /**
     * 查询院校端申报通用附件列表
     * 
     * @param collegesAttachment 院校端申报通用附件
     * @return 院校端申报通用附件集合
     */
    public List<CollegesAttachment> selectCollegesAttachmentList(CollegesAttachment collegesAttachment);

    /**
     * 新增院校端申报通用附件
     * 
     * @param collegesAttachment 院校端申报通用附件
     * @return 结果
     */
    public int insertCollegesAttachment(CollegesAttachment collegesAttachment);

    /**
     * 修改院校端申报通用附件
     * 
     * @param collegesAttachment 院校端申报通用附件
     * @return 结果
     */
    public int updateCollegesAttachment(CollegesAttachment collegesAttachment);

    /**
     * 删除院校端申报通用附件
     * 
     * @param attachmentId 院校端申报通用附件主键
     * @return 结果
     */
    public int deleteCollegesAttachmentByAttachmentId(Long attachmentId);

    /**
     * 批量删除院校端申报通用附件
     * 
     * @param attachmentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollegesAttachmentByAttachmentIds(Long[] attachmentIds);
}
