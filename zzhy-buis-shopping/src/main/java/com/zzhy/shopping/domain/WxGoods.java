package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 商品
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxGoods extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品名称
    */
    private String name;

    /**
    * 商品编码
    */
    private String goodsCode;

    /**
    * 商品主图
    */
    private String primaryPicUrl;

    /**
    * 供货商户ID
    */
    private Long merchantId;

    /**
    * 商品类型
    */
    private String goodsType;

    /**
    * 是否首页显示：0 是，1否。
    */
    private Boolean isHomePage;

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
    private Integer goodsNumber;

    /**
    * 商品描述
    */
    private String goodsDesc;

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
    * 状态: 0生效，1失效。2待审核
    */
    private Boolean status;

    /**
    * 审核状态：0待审核，1已审核，1已驳回
    */
    private Boolean auditStatus;

    /**
    * 逻辑删除：0正常，1删除
    */
    private Boolean recStatus;

    /**
    * 商品分类(一级)
    */
    private Long category;

    /**
    * 商品分类ID
    */
    private Long categoryId;

    /**
    * 分类商品推荐：0 是，1否。
    */
    private Boolean isHomeCategory;

    /**
    * 新人专享：0 是，1否。
    */
    private Boolean isNewOnly;

    /**
    * 运费
    */
    private BigDecimal freightCharge;

    /**
    * 购买人数，为空取真实值
    */
    private Integer sellTimes;

    /**
    * 统一代理价格
    */
    private BigDecimal agentPrice;

    /**
    * 供应价
    */
    private BigDecimal supplyPrice;

    /**
    * 商户id
    */
    private Integer storeId;

    /**
    * 商品二维码
    */
    private String qrCodeUrl;

    /**
    * 重量值单位克
    */
    private BigDecimal weightNum;

    /**
    * 品牌id
    */
    private Long brandId;

    /**
    * 是否使用积分抵扣标识: 0不使用，1使用抵扣比例，2是用固定金额   3全抵扣（只能用积分兑换）
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

    /**
    * 默认普通商品0 1为积分商品
    */
    private Boolean isIntegral;
}