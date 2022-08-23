package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.PubAudit;

/**
 * 审核历史Mapper接口
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
public interface PubAuditMapper 
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
     * 删除审核历史
     * 
     * @param id 审核历史主键
     * @return 结果
     */
    public int deletePubAuditById(Long id);

    /**
     * 批量删除审核历史
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePubAuditByIds(Long[] ids);
}
