package com.zzhy.supervise.service;

import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;
import com.zzhy.supervise.mapper.SupDeclareCollegesSchoolAuditMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/29 11:44
 */
@Service
public class SupDeclareCollegesSchoolAuditServiceImpl implements SupDeclareCollegesSchoolAuditService {
    @Resource
    private SupDeclareCollegesSchoolAuditMapper supDeclareCollegesSchoolAuditMapper;

    @Override
    public List<SupDeclareCollegesSchoolAudit> getBySourceId(Long sourceId) {
        return supDeclareCollegesSchoolAuditMapper.selectBySourceId(sourceId);
    }
}
