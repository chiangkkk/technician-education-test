package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 订单支付记录表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class NideshopOrderPay extends BaseEntity {
    /**
    * ID
    */
    private Long id;

    /**
    * 订单ID
    */
    private Long orderId;

    /**
    * 订单支付编码
    */
    private String outTradeNo;

    /**
    * 支付ID
    */
    private String payId;

    /**
    * 付款金额
    */
    private BigDecimal payAmount;

    /**
    * 付款方式
    */
    private String payType;

    /**
    * 付款方式名称
    */
    private String payTypeName;

    /**
    * 付款日期
    */
    private Date payTime;

    /**
    * 创建人账号
    */
    private String creator;

    /**
    * 创建人姓名
    */
    private String createName;

    /**
    * 修改人账号
    */
    private String modifier;

    /**
    * 修改人姓名
    */
    private String modifyName;

    /**
    * 修改时间
    */
    private Date modifyTime;

    /**
    * 状态: 0生效，1失效。
    */
    private Boolean status;

    /**
    * 逻辑删除：0正常，1删除
    */
    private Boolean recStatus;

    /**
    * 交易流水号
    */
    private String transactionId;
}