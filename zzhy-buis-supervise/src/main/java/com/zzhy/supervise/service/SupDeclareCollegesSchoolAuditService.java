package com.zzhy.supervise.service;

import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/29 11:43
 */
public interface SupDeclareCollegesSchoolAuditService {
 List<SupDeclareCollegesSchoolAudit> getBySourceId(Long sourceId);
}
