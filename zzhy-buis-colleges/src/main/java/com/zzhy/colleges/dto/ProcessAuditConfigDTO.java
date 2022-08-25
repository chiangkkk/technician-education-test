package com.zzhy.colleges.dto;

import com.zzhy.common.core.domain.entity.SysRole;
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/24 14:08
 */
@Data
public class ProcessAuditConfigDTO {
    private List<SysRole> roles;

    private List<CollegesProcessAuditConfig> configList;
}
