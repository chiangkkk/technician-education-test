package com.zzhy.shopping.service;

/**
 * @author ChiangKai
 * @date 2022/9/5 17:18
 */

import com.zzhy.shopping.domain.WxGoods;

import java.util.List;

public interface GoodsService {
    List<WxGoods> getGoods(WxGoods wxGoods);
}
