package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 商品与规格项关系表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxSpecAttrRef extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品ID wx_goods中
    */
    private Long goodsId;

    /**
    * 规格组ID wx_sku_spec中
    */
    private Long specId;

    /**
    * 规格项ID wx_sku_spec_attr
    */
    private Long itemId;

    /**
    * 规格项
    */
    private String itemValue;

    /**
    * 逻辑删除：0正常，1删除
    */
    private Boolean recStatus;
}