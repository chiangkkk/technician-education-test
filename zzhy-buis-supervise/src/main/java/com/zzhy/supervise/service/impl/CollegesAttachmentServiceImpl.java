package com.zzhy.supervise.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.supervise.mapper.CollegesAttachmentMapper;
import com.zzhy.supervise.domain.CollegesAttachment;
import com.zzhy.supervise.service.ICollegesAttachmentService;

/**
 * 院校端申报通用附件Service业务层处理
 * 
 * @author zzhy
 * @date 2022-06-05
 */
@Service
public class CollegesAttachmentServiceImpl implements ICollegesAttachmentService 
{
    @Autowired
    private CollegesAttachmentMapper collegesAttachmentMapper;

    /**
     * 查询院校端申报通用附件
     * 
     * @param attachmentId 院校端申报通用附件主键
     * @return 院校端申报通用附件
     */
    @Override
    public CollegesAttachment selectCollegesAttachmentByAttachmentId(Long attachmentId)
    {
        return collegesAttachmentMapper.selectCollegesAttachmentByAttachmentId(attachmentId);
    }

    /**
     * 查询院校端申报通用附件列表
     * 
     * @param collegesAttachment 院校端申报通用附件
     * @return 院校端申报通用附件
     */
    @Override
    public List<CollegesAttachment> selectCollegesAttachmentList(CollegesAttachment collegesAttachment)
    {
        return collegesAttachmentMapper.selectCollegesAttachmentList(collegesAttachment);
    }

    /**
     * 新增院校端申报通用附件
     * 
     * @param collegesAttachment 院校端申报通用附件
     * @return 结果
     */
    @Override
    public int insertCollegesAttachment(CollegesAttachment collegesAttachment)
    {
        collegesAttachment.setCreateTime(DateUtils.getNowDate());
        return collegesAttachmentMapper.insertCollegesAttachment(collegesAttachment);
    }

    /**
     * 修改院校端申报通用附件
     * 
     * @param collegesAttachment 院校端申报通用附件
     * @return 结果
     */
    @Override
    public int updateCollegesAttachment(CollegesAttachment collegesAttachment)
    {
        collegesAttachment.setUpdateTime(DateUtils.getNowDate());
        return collegesAttachmentMapper.updateCollegesAttachment(collegesAttachment);
    }

    /**
     * 批量删除院校端申报通用附件
     * 
     * @param attachmentIds 需要删除的院校端申报通用附件主键
     * @return 结果
     */
    @Override
    public int deleteCollegesAttachmentByAttachmentIds(Long[] attachmentIds)
    {
        return collegesAttachmentMapper.deleteCollegesAttachmentByAttachmentIds(attachmentIds);
    }

    /**
     * 删除院校端申报通用附件信息
     * 
     * @param attachmentId 院校端申报通用附件主键
     * @return 结果
     */
    @Override
    public int deleteCollegesAttachmentByAttachmentId(Long attachmentId)
    {
        return collegesAttachmentMapper.deleteCollegesAttachmentByAttachmentId(attachmentId);
    }
}
