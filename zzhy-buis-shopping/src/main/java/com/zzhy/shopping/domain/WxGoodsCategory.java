package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 商品分类
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class WxGoodsCategory extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 分类名称
    */
    private String categoryName;

    /**
    * 分类编码
    */
    private String categoryCode;

    /**
    * 上级ID
    */
    private Long parentId;

    /**
    * 分类等级，共有1,2,3三级分类
    */
    private Boolean level;

    /**
    * 类型：PT 普通商品；JF 积分商品
    */
    private String type;

    /**
    * 分类logo
    */
    private String logoImg;

    /**
    * 分类推荐图片
    */
    private String recommendImg;

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
    * 排序，数值越大越靠前
    */
    private Integer orderNum;

    /**
    * 商户Id
    */
    private Integer storeId;
}