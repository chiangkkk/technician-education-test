package com.zzhy.shopping.service;

import com.zzhy.shopping.domain.WxUserAwardRecord;

/**
 * @author ChiangKai
 * @date 2022/9/7 10:49
 */
public interface LotteryService {
    WxUserAwardRecord lottery(Long uid, Long turnTableId);
}
