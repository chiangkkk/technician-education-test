package com.zzhy.shopping.dto;

import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.domain.WxSku;
import com.zzhy.shopping.domain.WxSkuSpec;
import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/5 18:40
 */
@Data
public class GoodsDTO extends WxGoods {
    /**
     * 商品规格包含属性
     */
    private List<SpecWithAttr> spec;

    /**
     * SkuList
     */
    private List<WxSku> skuList;
}
