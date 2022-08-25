package com.zzhy.supervise.service.impl;

import com.zzhy.common.exception.WebException;
import com.zzhy.common.utils.bean.BeanUtils;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;
import com.zzhy.supervise.mapper.CollegesProcessAuditConfigMapper;
import com.zzhy.supervise.mapper.SchCollegesBasicReportingMapper;
import com.zzhy.supervise.mapper.SupDeclareCollegesSchoolAuditMapper;
import com.zzhy.supervise.service.CollegesReportingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/25 11:59
 */
@Service
@Slf4j
public class CollegesReportingServiceImpl implements CollegesReportingService {

    /**
     * 院校报备信息Mapper
     */
    @Resource
    private SchCollegesBasicReportingMapper reportingMapper;

    /**
     * 经办人配置Mapper
     */
    @Resource
    private CollegesProcessAuditConfigMapper collegesProcessAuditConfigMapper;


    @Resource
    private SupDeclareCollegesSchoolAuditMapper supDeclareCollegesSchoolAuditMapper;

    private long COLLEGESREPORTINGCONFIG = 2L;
    private String UNDELFLAG = "1";

    @Override
    public int addReport(SchCollegesBasicReporting schCollegesBasicReporting) {
        CollegesProcessAuditConfig selectWhere = new CollegesProcessAuditConfig();
        selectWhere.setDelFlag(UNDELFLAG);
        selectWhere.setSchConfigId(COLLEGESREPORTINGCONFIG);
        List<CollegesProcessAuditConfig> collegesProcessAuditConfigs = collegesProcessAuditConfigMapper.selectCollegesProcessAuditConfigList(selectWhere);
        if (collegesProcessAuditConfigs.size() == 0) {
            throw new WebException("未配置审核人，无法进行院校报备，请联系管理员");
        }
        int result = reportingMapper.insertSelective(schCollegesBasicReporting);
        log.info("{},{}", result, schCollegesBasicReporting);
        collegesProcessAuditConfigs.sort(Comparator.comparingLong(CollegesProcessAuditConfig::getAuditOrder));
        collegesProcessAuditConfigs.forEach(collegesProcessAuditConfig -> {
            SupDeclareCollegesSchoolAudit supDeclareCollegesSchoolAudit = new SupDeclareCollegesSchoolAudit();
            supDeclareCollegesSchoolAudit.setAuditOrder(collegesProcessAuditConfig.getAuditOrder().byteValue());
//            supDeclareCollegesSchoolAudit.setAuditStatus();
            supDeclareCollegesSchoolAudit.setSchoolId(collegesProcessAuditConfigs.get(0).getSchoolId());
            supDeclareCollegesSchoolAudit.setRoleId(collegesProcessAuditConfig.getRoleId());
            supDeclareCollegesSchoolAudit.setRoleName(collegesProcessAuditConfig.getRoleName());
            //待审核
            supDeclareCollegesSchoolAudit.setAuditStatus("1");
            supDeclareCollegesSchoolAudit.setDelFlag("1");
            supDeclareCollegesSchoolAudit.setCreateTime(new Date());
            supDeclareCollegesSchoolAudit.setUpdateTime(new Date());
            supDeclareCollegesSchoolAuditMapper.insertSelective(supDeclareCollegesSchoolAudit);
        });
        return 1;
    }
}
