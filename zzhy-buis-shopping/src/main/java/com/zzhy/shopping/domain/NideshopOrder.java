package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
    * 订单表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class NideshopOrder extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单号
    */
    private String orderSn;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 买家姓名
    */
    private String username;

    /**
    * 订单状态
   //订单相关状态字段设计，采用单个字段表示全部的订单状态
    //1xx 表示订单取消和删除等状态 0订单创建成功等待付款，　101订单已取消，　102订单已删除
    //2xx 表示订单支付状态　201订单已付款，等待发货
    //3xx 表示订单物流相关状态　300订单已发货， 301用户确认收货
    //4xx 表示订单退换货相关的状态　401 没有发货，退款　402 已收货，退款退货
    */
    private Integer orderStatus;

    /**
    * 快递状态
    */
    private Boolean shippingStatus;

    /**
    * 支付状态
    */
    private Boolean payStatus;

    /**
    * 收货人
    */
    private String consignee;

    /**
    * 国家
    */
    private String country;

    /**
    * 省份
    */
    private String province;

    /**
    * 城市
    */
    private String city;

    /**
    * 区县
    */
    private String district;

    /**
    * 详细地址
    */
    private String address;

    /**
    * 地址经纬度
    */
    private String lngLat;

    /**
    * 手机号码
    */
    private String mobile;

    /**
    * 补充说明
    */
    private String postscript;

    /**
    * 快递公司ID
    */
    private Long shippingId;

    /**
    * 快递公司名称
    */
    private String shippingName;

    /**
    * 支付ID
    */
    private String payId;

    /**
    * 支付方式名称
    */
    private String payName;

    /**
    * 快递费
    */
    private BigDecimal shippingFee;

    /**
    * 实际需要支付的金额
    */
    private BigDecimal actualPrice;

    /**
    * 获得的积分数
    */
    private Long integral;

    /**
    * 应付积分价
    */
    private Long integralMoney;

    /**
    * 订单总价
    */
    private BigDecimal orderPrice;

    /**
    * 商品总价
    */
    private BigDecimal goodsPrice;

    /**
    * 统一代理总价
    */
    private BigDecimal agentPrice;

    /**
    * 新增时间
    */
    private Date addTime;

    /**
    * 确认时间
    */
    private Date confirmTime;

    /**
    * 付款时间
    */
    private Date payTime;

    /**
    * 付款方式
    */
    private String payType;

    /**
    * 配送费用
    */
    private BigDecimal freightPrice;

    /**
    * 使用的优惠券id
    */
    private Long userCouponId;

    /**
    * 优惠券名称
    */
    private String couponName;

    private Long parentId;

    /**
    * 优惠券抵用价
    */
    private BigDecimal couponPrice;

    private Object callbackStatus;

    /**
    * 快递单单号
    */
    private String shippingNo;

    private BigDecimal fullCutPrice;

    /**
    * 订单类型：CZ 充值订单，JF 积分订单，DD 订单, COUPON 团购券订单
    */
    private String orderType;

    /**
    * 配送方式：ZT 自提，KD 快递
    */
    private String shippingType;

    /**
    * 取货码
    */
    private String pickUpCode;

    /**
    * 取货码(已使用)
    */
    private String pickUpCodeUsed;

    /**
    * 是否打印小票: 0 是， 1否
    */
    private Boolean printTicketFlag;

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
    * 是否已经统计：0 未统计，1已统计
    */
    private Boolean statisticsStatus;

    /**
    * 商户id
    */
    private Integer storeId;

    /**
    * 取货码二维码
    */
    private String pickUpCodeUrl;

    /**
    * 重量值单位克
    */
    private Long weightNum;

    /**
    * 打印状态标识 0没有打印 1已打印
    */
    private Boolean printStatus;
}