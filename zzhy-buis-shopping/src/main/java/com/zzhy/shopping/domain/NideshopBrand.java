package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 品牌表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class NideshopBrand extends BaseEntity {
    private Long id;

    /**
    * 品牌名称
    */
    private String name;

    /**
    * 图片
    */
    private String listPicUrl;

    /**
    * 描述
    */
    private String simpleDesc;

    /**
    * 图片
    */
    private String picUrl;

    /**
    * 排序
    */
    private Byte sortOrder;

    /**
    * 显示
    */
    private Byte isShow;

    private BigDecimal floorPrice;

    /**
    * app显示图片
    */
    private String appListPicUrl;

    /**
    * 新品牌
    */
    private Byte isNew;

    /**
    * 图片
    */
    private String newPicUrl;

    /**
    * 排序
    */
    private Byte newSortOrder;

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

    private Long merchantId;

    private Long storeId;
}