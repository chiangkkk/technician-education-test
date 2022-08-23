package com.zzhy.system.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.PubAuditMapper;
import com.zzhy.system.domain.PubAudit;
import com.zzhy.system.service.IPubAuditService;

/**
 * 审核历史Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
@Service
public class PubAuditServiceImpl implements IPubAuditService
{
    @Autowired
    private PubAuditMapper pubAuditMapper;

    /**
     * 查询审核历史
     * 
     * @param id 审核历史主键
     * @return 审核历史
     */
    @Override
    public PubAudit selectPubAuditById(Long id)
    {
        return pubAuditMapper.selectPubAuditById(id);
    }

    /**
     * 查询审核历史列表
     * 
     * @param pubAudit 审核历史
     * @return 审核历史
     */
    @Override
    public List<PubAudit> selectPubAuditList(PubAudit pubAudit)
    {
        return pubAuditMapper.selectPubAuditList(pubAudit);
    }

    /**
     * 新增审核历史
     * 
     * @param pubAudit 审核历史
     * @return 结果
     */
    @Override
    public int insertPubAudit(PubAudit pubAudit)
    {
        pubAudit.setCreateTime(DateUtils.getNowDate());
        return pubAuditMapper.insertPubAudit(pubAudit);
    }

    /**
     * 修改审核历史
     * 
     * @param pubAudit 审核历史
     * @return 结果
     */
    @Override
    public int updatePubAudit(PubAudit pubAudit)
    {
        pubAudit.setUpdateTime(DateUtils.getNowDate());
        return pubAuditMapper.updatePubAudit(pubAudit);
    }

    /**
     * 批量删除审核历史
     * 
     * @param ids 需要删除的审核历史主键
     * @return 结果
     */
    @Override
    public int deletePubAuditByIds(Long[] ids)
    {
        return pubAuditMapper.deletePubAuditByIds(ids);
    }

    /**
     * 删除审核历史信息
     * 
     * @param id 审核历史主键
     * @return 结果
     */
    @Override
    public int deletePubAuditById(Long id)
    {
        return pubAuditMapper.deletePubAuditById(id);
    }
}
