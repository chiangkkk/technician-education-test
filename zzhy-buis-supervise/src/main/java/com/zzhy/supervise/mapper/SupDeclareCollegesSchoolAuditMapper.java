package com.zzhy.supervise.mapper;

import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;

import java.util.List;

public interface SupDeclareCollegesSchoolAuditMapper {
    int deleteByPrimaryKey(Long auditId);

    int insert(SupDeclareCollegesSchoolAudit record);

    int insertSelective(SupDeclareCollegesSchoolAudit record);

    SupDeclareCollegesSchoolAudit selectByPrimaryKey(Long auditId);

    int updateByPrimaryKeySelective(SupDeclareCollegesSchoolAudit record);

    int updateByPrimaryKey(SupDeclareCollegesSchoolAudit record);

    List<SupDeclareCollegesSchoolAudit> selectBySourceId(Long sourceId);


}