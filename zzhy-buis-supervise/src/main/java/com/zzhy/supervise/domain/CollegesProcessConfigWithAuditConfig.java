package com.zzhy.supervise.domain;

import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/24 20:45
 */
@Data
public class CollegesProcessConfigWithAuditConfig extends CollegesProcessConfig {
    private List<CollegesProcessAuditConfig> auditConfigList;
}
