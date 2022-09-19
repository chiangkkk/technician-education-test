package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 订单商品表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class NideshopOrderGoods extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 订单Id
    */
    private Long orderId;

    /**
    * 商品id
    */
    private Long goodsId;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 商品序列号
    */
    private String goodsCode;

    /**
    * 商品数量
    */
    private Short number;

    /**
    * 原价
    */
    private BigDecimal originalPrice;

    /**
    * 售价
    */
    private BigDecimal sellingPrice;

    /**
    * 统一代理价
    */
    private BigDecimal agentPrice;

    /**
    * 应付积分价
    */
    private Integer integralMoney;

    /**
    * 虚拟商品
    */
    private Boolean isReal;

    /**
    * 图片链接
    */
    private String primaryPicUrl;

    /**
    * 规格组合Id
    */
    private String specAtrrIds;

    /**
    * 规格组合名称
    */
    private String specAtrrVal;

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
    * 供应商Id
    */
    private Long merchantId;

    /**
    * 供应价
    */
    private BigDecimal supplyPrice;

    /**
    * 重量值单位克
    */
    private Long weightNum;
}