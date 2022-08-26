package com.zzhy.supervise.domain.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChiangKai
 * @date 2022/8/26 17:28
 */
@NoArgsConstructor
@Data
public class AuditInfoVO {


    @JsonProperty("reportingId")
    private Integer reportingId;

    @JsonProperty("auditStatus")
    private Integer auditStatus;

    @JsonProperty("auditRemark")
    private String auditRemark;
}
