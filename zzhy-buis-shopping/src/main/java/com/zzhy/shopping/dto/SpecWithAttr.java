package com.zzhy.shopping.dto;

import com.zzhy.shopping.domain.WxSkuSpec;
import com.zzhy.shopping.domain.WxSkuSpecAttr;
import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/6 9:39
 */
@Data
public class SpecWithAttr extends WxSkuSpec {
    private List<WxSkuSpecAttr> attrs;
}
