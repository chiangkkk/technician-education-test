package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 规格类型
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxSkuSpec extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品编码wx_goods中
    */
    private String goodsCode;

    /**
    * 规格名称
    */
    private String specName;

    /**
    * 创建人账号
    */
    private String creator;

    /**
    * 修改人账号
    */
    private String modifier;

    /**
    * 修改时间
    */
    private Date modifyTime;

    /**
    * 逻辑删除：0正常，1删除
    */
    private Boolean recStatus;

    /**
    * 商户id
    */
    private Integer storeId;
}