package com.zzhy.supervise.mapper;

import java.util.List;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import org.apache.ibatis.annotations.Param;

/**
 * 院校端申报流程审核配置（默认对应院校的管理员角色）Mapper接口
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public interface CollegesProcessAuditConfigMapper 
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
     * 删除院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param declareAuditId 院校端申报流程审核配置（默认对应院校的管理员角色）主键
     * @return 结果
     */
    public int deleteCollegesProcessAuditConfigByDeclareAuditId(Long declareAuditId);

    /**
     * 批量删除院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param declareAuditIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollegesProcessAuditConfigByDeclareAuditIds(Long[] declareAuditIds);

    /**
     * 根据申报流程配置id查询审核配置表
     *
     * @param id
     * @return
     */
    public List<CollegesProcessAuditConfig> selectCollegesProcessAuditConfigListByConfigId(Long id);

    /**
     * 根据申报流程配置ID软删
     * @param id
     * @return
     */
    int deleteBySchConfigId(@Param("id") Integer id, @Param("operator") String operator);
}
