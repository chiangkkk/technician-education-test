package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 达达订单详情表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxDadaOrderDetails extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单Id  -- 关联订单表
    */
    private Long orderId;

    /**
    * 订单号
    */
    private String orderSn;

    /**
    * 订单状态(待接单＝1,待取货＝2,配送中＝3,已完成＝4,已取消＝5, 指派单=8,妥投异常之物品返回中=9, 妥投异常之物品返回完成=10, 骑士到店=100,创建达达运单失败=1000 可参考文末的状态说明）
    */
    private Integer statusCode;

    /**
    * 订单状态
    */
    private String statusMsg;

    /**
    * 骑手姓名
    */
    private String transporterName;

    /**
    * 骑手电话
    */
    private String transporterPhone;

    /**
    * 骑手经度
    */
    private String transporterLng;

    /**
    * 骑手纬度
    */
    private String transporterLat;

    /**
    * 配送费
    */
    private BigDecimal deliveryFee;

    /**
    * 小费
    */
    private BigDecimal tips;

    /**
    * 优惠劵费用
    */
    private BigDecimal couponFee;

    /**
    * 保价费
    */
    private BigDecimal insuranceFee;

    /**
    * 实际支付费用
    */
    private BigDecimal actualFee;

    /**
    * 配送距离
    */
    private BigDecimal distance;

    /**
    * 接单时间
    */
    private String acceptTime;

    /**
    * 取货时间
    */
    private String fetchTime;

    /**
    * 送达时间
    */
    private String finishTime;

    /**
    * 订单取消时间
    */
    private String cancelTime;

    /**
    * 收货码
    */
    private String orderFinishCode;

    /**
    * 违约金
    */
    private BigDecimal deductFee;
}