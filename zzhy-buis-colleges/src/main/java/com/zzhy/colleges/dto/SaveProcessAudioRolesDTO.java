package com.zzhy.colleges.dto;

import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/24 16:26
 */
@Data
public class SaveProcessAudioRolesDTO {
    private List<CollegesProcessAuditConfig> configList;
    private Integer schConfigId;
}
