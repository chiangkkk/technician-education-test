package com.zzhy.supervise.domain.vo;

import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;
import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/26 9:52
 */
@Data
public class ReportingVO extends SchCollegesBasicReporting {
    private List<SupDeclareCollegesSchoolAudit> declareCollegesSchoolAudits;
}
