package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.PubAudit;

/**
 * 审核历史Service接口
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
public interface IPubAuditService 
{
    /**
     * 查询审核历史
     * 
     * @param id 审核历史主键
     * @return 审核历史
     */
    public PubAudit selectPubAuditById(Long id);

    /**
     * 查询审核历史列表
     * 
     * @param pubAudit 审核历史
     * @return 审核历史集合
     */
    public List<PubAudit> selectPubAuditList(PubAudit pubAudit);

    /**
     * 新增审核历史
     * 
     * @param pubAudit 审核历史
     * @return 结果
     */
    public int insertPubAudit(PubAudit pubAudit);

    /**
     * 修改审核历史
     * 
     * @param pubAudit 审核历史
     * @return 结果
     */
    public int updatePubAudit(PubAudit pubAudit);

    /**
     * 批量删除审核历史
     * 
     * @param ids 需要删除的审核历史主键集合
     * @return 结果
     */
    public int deletePubAuditByIds(Long[] ids);

    /**
     * 删除审核历史信息
     * 
     * @param id 审核历史主键
     * @return 结果
     */
    public int deletePubAuditById(Long id);
}
