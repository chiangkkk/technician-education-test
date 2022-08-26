package com.zzhy.supervise.service;

import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.domain.vo.AuditInfoVO;
import com.zzhy.supervise.domain.vo.ReportingVO;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/25 11:07
 */
public interface CollegesReportingService {

    /**
     * 添加院校基本报备情况
     * @param SchCollegesBasicReporting
     * @return
     */
    int addReport(SchCollegesBasicReporting SchCollegesBasicReporting);

    int editReport(SchCollegesBasicReporting SchCollegesBasicReporting);

    List<ReportingVO> getList(String schoolCode, String schoolName, Long reportingYear, Integer declareStatus, Integer waitingAudit,Long[] roleIds);

    SchCollegesBasicReporting getById(Integer reportingId);

    int audit(AuditInfoVO auditInfoVO, List<Long> roleIds);
}
