package com.zzhy.supervise.service;

import java.util.List;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;

/**
 * 院校端申报流程审核配置（默认对应院校的管理员角色）Service接口
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public interface ICollegesProcessAuditConfigService 
{
    /**
     * 查询院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param declareAuditId 院校端申报流程审核配置（默认对应院校的管理员角色）主键
     * @return 院校端申报流程审核配置（默认对应院校的管理员角色）
     */
    public CollegesProcessAuditConfig selectCollegesProcessAuditConfigByDeclareAuditId(Long declareAuditId);

    /**
     * 查询院校端申报流程审核配置（默认对应院校的管理员角色）列表
     * 
     * @param collegesProcessAuditConfig 院校端申报流程审核配置（默认对应院校的管理员角色）
     * @return 院校端申报流程审核配置（默认对应院校的管理员角色）集合
     */
    public List<CollegesProcessAuditConfig> selectCollegesProcessAuditConfigList(CollegesProcessAuditConfig collegesProcessAuditConfig);

    /**
     * 新增院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param collegesProcessAuditConfig 院校端申报流程审核配置（默认对应院校的管理员角色）
     * @return 结果
     */
    public int insertCollegesProcessAuditConfig(CollegesProcessAuditConfig collegesProcessAuditConfig);

    /**
     * 修改院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param collegesProcessAuditConfig 院校端申报流程审核配置（默认对应院校的管理员角色）
     * @return 结果
     */
    public int updateCollegesProcessAuditConfig(CollegesProcessAuditConfig collegesProcessAuditConfig);

    /**
     * 批量删除院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param declareAuditIds 需要删除的院校端申报流程审核配置（默认对应院校的管理员角色）主键集合
     * @return 结果
     */
    public int deleteCollegesProcessAuditConfigByDeclareAuditIds(Long[] declareAuditIds);

    /**
     * 删除院校端申报流程审核配置（默认对应院校的管理员角色）信息
     * 
     * @param declareAuditId 院校端申报流程审核配置（默认对应院校的管理员角色）主键
     * @return 结果
     */
    public int deleteCollegesProcessAuditConfigByDeclareAuditId(Long declareAuditId);
}
