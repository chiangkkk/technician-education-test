package com.zzhy.supervise.mapper;

import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;

public interface SupDeclareCollegesSchoolAuditMapper {
    int deleteByPrimaryKey(Long auditId);

    int insert(SupDeclareCollegesSchoolAudit record);

    int insertSelective(SupDeclareCollegesSchoolAudit record);

    SupDeclareCollegesSchoolAudit selectByPrimaryKey(Long auditId);

    int updateByPrimaryKeySelective(SupDeclareCollegesSchoolAudit record);

    int updateByPrimaryKey(SupDeclareCollegesSchoolAudit record);
}