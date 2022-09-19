package com.zzhy.shopping.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

/**
 * @author ChiangKai
 * @date 2022/9/15 21:36
 */
@Data
public class YlyResultDTO {
    private Integer error;
    @JSONField(name = "error_description")
    private String errorDescription;

    private Map<String,Object> body;
}
