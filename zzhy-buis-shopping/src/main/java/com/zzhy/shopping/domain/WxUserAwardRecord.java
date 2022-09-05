package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 用户中奖纪录表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxUserAwardRecord extends BaseEntity {
    /**
    * ID
    */
    private Long id;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 中奖项
    */
    private String awardName;

    /**
    * 关联关系ID，目前主要是管理订单id,订单表
    */
    private Long orderId;

    private Long couponId;

    /**
    * 配置商品时需要区分是skuId还是goodsId，默认是 0-表示goodsId，1-表示skuId
    */
    private Byte skuType;

    private Long goodsId;

    /**
    * 用于下单处理
    */
    private String orderDetail;

    /**
    * 奖品图片
    */
    private String pic;

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
    * 关联奖项选项id
    */
    private Long awardId;

    /**
    * 转盘抽奖类型配置id
    */
    private Long awardType;

    /**
    * 抽奖消耗的积分值（对应抽奖配置的）
    */
    private BigDecimal integralVal;
}