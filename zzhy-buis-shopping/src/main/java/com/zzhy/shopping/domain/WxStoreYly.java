package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 门店易联云关联表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxStoreYly extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 门店id
    */
    private Long storeId;

    private String accessToken;

    private String refreshToken;

    private String machineCode;

    /**
    * 开始时间
    */
    private Date startTime;

    /**
    * 结束时间
    */
    private Date endTime;

    private String scope;

    /**
    * 状态: 0生效，1失效。
    */
    private Boolean status;

    /**
    * 修改时间
    */
    private Date modifyTime;
}