package com.zzhy.supervise.service.impl;

import java.util.Date;
import java.util.List;

import com.zzhy.common.core.domain.entity.SysRole;
import com.zzhy.common.utils.DateUtils;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import com.zzhy.supervise.domain.CollegesProcessConfigWithAuditConfig;
import com.zzhy.supervise.mapper.CollegesProcessAuditConfigMapper;
import com.zzhy.system.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.supervise.mapper.CollegesProcessConfigMapper;
import com.zzhy.supervise.domain.CollegesProcessConfig;
import com.zzhy.supervise.service.ICollegesProcessConfigService;

import javax.annotation.Resource;

/**
 * 院校端申报流程配置Service业务层处理
 *
 * @author zzhy
 * @date 2022-06-05
 */
@Service
public class CollegesProcessConfigServiceImpl implements ICollegesProcessConfigService {
    @Autowired
    private CollegesProcessConfigMapper collegesProcessConfigMapper;

    @Resource
    private CollegesProcessAuditConfigMapper auditConfigMapper;
    @Resource
    private SysRoleMapper roleMapper;

    /**
     * 查询院校端申报流程配置
     *
     * @param schConfigId 院校端申报流程配置主键
     * @return 院校端申报流程配置
     */
    @Override
    public CollegesProcessConfig selectCollegesProcessConfigBySchConfigId(Long schConfigId) {
        return collegesProcessConfigMapper.selectCollegesProcessConfigBySchConfigId(schConfigId);
    }

    /**
     * 查询院校端申报流程配置列表
     *
     * @param collegesProcessConfig 院校端申报流程配置
     * @return 院校端申报流程配置
     */
    @Override
    public List<CollegesProcessConfig> selectCollegesProcessConfigList(CollegesProcessConfig collegesProcessConfig) {
        return collegesProcessConfigMapper.selectCollegesProcessConfigList(collegesProcessConfig);
    }

    @Override
    public List<CollegesProcessConfigWithAuditConfig> selectCollegesProcessConfigWithAuditList(CollegesProcessConfig collegesProcessConfig) {
        return collegesProcessConfigMapper.selectCollegesProcessConfigWithAuditList(collegesProcessConfig);
    }

    /**
     * 新增院校端申报流程配置
     *
     * @param collegesProcessConfig 院校端申报流程配置
     * @return 结果
     */
    @Override
    public int insertCollegesProcessConfig(CollegesProcessConfig collegesProcessConfig) {
        collegesProcessConfig.setCreateTime(DateUtils.getNowDate());
        return collegesProcessConfigMapper.insertCollegesProcessConfig(collegesProcessConfig);
    }

    /**
     * 修改院校端申报流程配置
     *
     * @param collegesProcessConfig 院校端申报流程配置
     * @return 结果
     */
    @Override
    public int updateCollegesProcessConfig(CollegesProcessConfig collegesProcessConfig) {
        collegesProcessConfig.setUpdateTime(DateUtils.getNowDate());
        return collegesProcessConfigMapper.updateCollegesProcessConfig(collegesProcessConfig);
    }

    /**
     * 批量删除院校端申报流程配置
     *
     * @param schConfigIds 需要删除的院校端申报流程配置主键
     * @return 结果
     */
    @Override
    public int deleteCollegesProcessConfigBySchConfigIds(Long[] schConfigIds) {
        return collegesProcessConfigMapper.deleteCollegesProcessConfigBySchConfigIds(schConfigIds);
    }

    /**
     * 删除院校端申报流程配置信息
     *
     * @param schConfigId 院校端申报流程配置主键
     * @return 结果
     */
    @Override
    public int deleteCollegesProcessConfigBySchConfigId(Long schConfigId) {
        return collegesProcessConfigMapper.deleteCollegesProcessConfigBySchConfigId(schConfigId);
    }

    @Override
    public List<CollegesProcessAuditConfig> getByProcessConfigId(Integer id) {
        return auditConfigMapper.selectCollegesProcessAuditConfigListByConfigId(id.longValue());
    }

    @Override
    public List<SysRole> getRoles(Long schoolId) {
        return roleMapper.selectRolesBySchoolId(schoolId);
    }

    @Override
    public int ProcessAuditConfig(List<CollegesProcessAuditConfig> configList, Integer schConfigId, String operator, Long schoolId) {
        auditConfigMapper.deleteBySchConfigId(schConfigId, operator);
        configList.forEach(item -> {
            item.setSchoolId(schoolId);
            Date now = new Date();
            item.setCreateTime(now);
            item.setUpdateTime(now);
            item.setCreateBy(operator);
            item.setUpdateBy(operator);
            item.setDelFlag("1");
            auditConfigMapper.insertCollegesProcessAuditConfig(item);
        });

        return 1;
    }

}
