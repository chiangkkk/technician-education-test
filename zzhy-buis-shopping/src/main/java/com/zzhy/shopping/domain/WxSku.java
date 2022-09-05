package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 商品SKU
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxSku extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * sku名称
    */
    private String skuName;

    /**
    * sku编码
    */
    private String skuCode;

    /**
    * 商品编码wx_goods中
    */
    private String goodsCode;

    /**
    * 商品Id
    */
    private Integer goodsId;

    /**
    * sku主图
    */
    private String primaryPicUrl;

    /**
    * 原价
    */
    private BigDecimal originalPrice;

    /**
    * 售价
    */
    private BigDecimal sellingPrice;

    /**
    * 积分（售价）
    */
    private BigDecimal integralPrice;

    /**
    * 库存数量
    */
    private Integer skuNumber;

    /**
    * PT普通商品，JT积分商品
    */
    private String skuType;

    /**
    * 规格组合编码
    */
    private String specAtrrIds;

    /**
    * 规格组合名称
    */
    private String specAtrrVal;

    /**
    * 商品描述
    */
    private String skuDesc;

    /**
    * 状态更新时间
    */
    private Date statusDate;

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
    * 统一代理价格
    */
    private BigDecimal agentPrice;

    /**
    * 供应价
    */
    private BigDecimal supplyPrice;

    /**
    * 重量值 单位克
    */
    private Long weightNum;

    /**
    * 品牌id
    */
    private Long brandId;

    /**
    * 是否使用积分标识: 0不使用，1使用抵扣比例，2是用固定金额  3全抵扣（只能用积分兑换）
    */
    private Boolean isUseIntegral;

    /**
    * 积分抵扣金额
    */
    private BigDecimal deductionMoney;

    /**
    * 积分抵扣比例
    */
    private BigDecimal deductionProportion;
}