package com.zzhy.supervise.service.impl;

import com.sun.jna.platform.win32.User32Util;
import com.zzhy.common.exception.WebException;
import com.zzhy.common.utils.DateUtils;
import com.zzhy.common.utils.bean.BeanUtils;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;
import com.zzhy.supervise.domain.vo.AuditInfoVO;
import com.zzhy.supervise.domain.vo.ReportingVO;
import com.zzhy.supervise.mapper.CollegesProcessAuditConfigMapper;
import com.zzhy.supervise.mapper.SchCollegesBasicReportingMapper;
import com.zzhy.supervise.mapper.SupDeclareCollegesSchoolAuditMapper;
import com.zzhy.supervise.service.CollegesReportingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
        schCollegesBasicReporting.setAuditStatus("1");
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
            supDeclareCollegesSchoolAudit.setAuditStatus("2");
            supDeclareCollegesSchoolAudit.setSourceId(schCollegesBasicReporting.getReportingId());
            supDeclareCollegesSchoolAudit.setDelFlag("1");
            supDeclareCollegesSchoolAudit.setCreateTime(new Date());
            supDeclareCollegesSchoolAudit.setUpdateTime(new Date());
            supDeclareCollegesSchoolAuditMapper.insertSelective(supDeclareCollegesSchoolAudit);
        });
        return 1;
    }

    @Override
    public int editReport(SchCollegesBasicReporting schCollegesBasicReporting) {
        return reportingMapper.updateByPrimaryKeySelective(schCollegesBasicReporting);
    }

    @Override
    public List<ReportingVO> getList(String schoolCode, String schoolName, Long reportingYear, Integer declareStatus, Integer waitingAudit, Long[] roleIds) {
        List<ReportingVO> reportingVOS = reportingMapper.selectWithAuditoList(schoolCode, schoolName, reportingYear, declareStatus);
        reportingVOS.forEach(item -> {
            List<SupDeclareCollegesSchoolAudit> declareCollegesSchoolAudits = item.getDeclareCollegesSchoolAudits();
            if (declareCollegesSchoolAudits.size() > 0) {
                List<SupDeclareCollegesSchoolAudit> filterAudito = declareCollegesSchoolAudits.stream()
                        .filter(i -> Arrays.stream(roleIds).anyMatch(roleId -> roleId.equals(i.getRoleId()))).collect(Collectors.toList());
                item.setDeclareCollegesSchoolAudits(filterAudito);
            }
        });
        return reportingVOS;
    }

    @Override
    public SchCollegesBasicReporting getById(Integer reportingId) {
        return reportingMapper.selectByPrimaryKey(reportingId.longValue());
    }

    @Override
    public int audit(AuditInfoVO auditInfoVO, List<Long> roleIds) {
        String auditRemark = auditInfoVO.getAuditRemark();
        Integer auditStatus = auditInfoVO.getAuditStatus();
        Integer reportingId = auditInfoVO.getReportingId();
        List<SupDeclareCollegesSchoolAudit> supDeclareCollegesSchoolAudits = supDeclareCollegesSchoolAuditMapper.selectBySourceId(reportingId.longValue());
        SupDeclareCollegesSchoolAudit supDeclareCollegesSchoolAuditDo = null;
        for (SupDeclareCollegesSchoolAudit supDeclareCollegesSchoolAudit : supDeclareCollegesSchoolAudits) {
            Long roleIdDo = roleIds.stream()
                    .filter(roleId -> Long.compare(supDeclareCollegesSchoolAudit.getRoleId(), roleId) == 0).findFirst()
                    .orElse(null);
            if (roleIdDo != null) {
                supDeclareCollegesSchoolAuditDo = supDeclareCollegesSchoolAudit;
                break;
            }
        }
        if (supDeclareCollegesSchoolAuditDo == null){
            throw new WebException("你无权限评审");
        }
        SchCollegesBasicReporting schCollegesBasicReporting = reportingMapper.selectByPrimaryKey(reportingId.longValue());
        supDeclareCollegesSchoolAuditDo.setAuditRemark(auditRemark);
        supDeclareCollegesSchoolAuditDo.setAuditStatus(auditStatus.toString());
        if (auditStatus == 4){
            schCollegesBasicReporting.setAuditStatus("4");
            schCollegesBasicReporting.setUpdateTime(DateUtils.getNowDate());
            reportingMapper.updateByPrimaryKeySelective(schCollegesBasicReporting);
        }
        if (auditStatus == 3 && supDeclareCollegesSchoolAuditDo.getAuditOrder().intValue() == 1){
            schCollegesBasicReporting.setAuditStatus("3");
            schCollegesBasicReporting.setUpdateTime(DateUtils.getNowDate());
            reportingMapper.updateByPrimaryKeySelective(schCollegesBasicReporting);
        }
        supDeclareCollegesSchoolAuditDo.setAuditRemark(auditRemark);
        supDeclareCollegesSchoolAuditDo.setAuditStatus(auditStatus+"");
        supDeclareCollegesSchoolAuditDo.setUpdateTime(new Date());
        supDeclareCollegesSchoolAuditMapper.updateByPrimaryKey(supDeclareCollegesSchoolAuditDo);
        return  1;

    }


}
