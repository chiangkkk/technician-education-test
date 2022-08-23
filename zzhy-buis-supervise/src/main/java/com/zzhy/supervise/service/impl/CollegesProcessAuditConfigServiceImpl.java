package com.zzhy.supervise.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.supervise.mapper.CollegesProcessAuditConfigMapper;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import com.zzhy.supervise.service.ICollegesProcessAuditConfigService;

/**
 * 院校端申报流程审核配置（默认对应院校的管理员角色）Service业务层处理
 * 
 * @author zzhy
 * @date 2022-06-05
 */
@Service
public class CollegesProcessAuditConfigServiceImpl implements ICollegesProcessAuditConfigService 
{
    @Autowired
    private CollegesProcessAuditConfigMapper collegesProcessAuditConfigMapper;

    /**
     * 查询院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param declareAuditId 院校端申报流程审核配置（默认对应院校的管理员角色）主键
     * @return 院校端申报流程审核配置（默认对应院校的管理员角色）
     */
    @Override
    public CollegesProcessAuditConfig selectCollegesProcessAuditConfigByDeclareAuditId(Long declareAuditId)
    {
        return collegesProcessAuditConfigMapper.selectCollegesProcessAuditConfigByDeclareAuditId(declareAuditId);
    }

    /**
     * 查询院校端申报流程审核配置（默认对应院校的管理员角色）列表
     * 
     * @param collegesProcessAuditConfig 院校端申报流程审核配置（默认对应院校的管理员角色）
     * @return 院校端申报流程审核配置（默认对应院校的管理员角色）
     */
    @Override
    public List<CollegesProcessAuditConfig> selectCollegesProcessAuditConfigList(CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        return collegesProcessAuditConfigMapper.selectCollegesProcessAuditConfigList(collegesProcessAuditConfig);
    }

    /**
     * 新增院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param collegesProcessAuditConfig 院校端申报流程审核配置（默认对应院校的管理员角色）
     * @return 结果
     */
    @Override
    public int insertCollegesProcessAuditConfig(CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        collegesProcessAuditConfig.setCreateTime(DateUtils.getNowDate());
        return collegesProcessAuditConfigMapper.insertCollegesProcessAuditConfig(collegesProcessAuditConfig);
    }

    /**
     * 修改院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param collegesProcessAuditConfig 院校端申报流程审核配置（默认对应院校的管理员角色）
     * @return 结果
     */
    @Override
    public int updateCollegesProcessAuditConfig(CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        collegesProcessAuditConfig.setUpdateTime(DateUtils.getNowDate());
        return collegesProcessAuditConfigMapper.updateCollegesProcessAuditConfig(collegesProcessAuditConfig);
    }

    /**
     * 批量删除院校端申报流程审核配置（默认对应院校的管理员角色）
     * 
     * @param declareAuditIds 需要删除的院校端申报流程审核配置（默认对应院校的管理员角色）主键
     * @return 结果
     */
    @Override
    public int deleteCollegesProcessAuditConfigByDeclareAuditIds(Long[] declareAuditIds)
    {
        return collegesProcessAuditConfigMapper.deleteCollegesProcessAuditConfigByDeclareAuditIds(declareAuditIds);
    }

    /**
     * 删除院校端申报流程审核配置（默认对应院校的管理员角色）信息
     * 
     * @param declareAuditId 院校端申报流程审核配置（默认对应院校的管理员角色）主键
     * @return 结果
     */
    @Override
    public int deleteCollegesProcessAuditConfigByDeclareAuditId(Long declareAuditId)
    {
        return collegesProcessAuditConfigMapper.deleteCollegesProcessAuditConfigByDeclareAuditId(declareAuditId);
    }
}
