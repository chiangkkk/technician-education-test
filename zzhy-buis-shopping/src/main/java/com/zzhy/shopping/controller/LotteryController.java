package com.zzhy.shopping.controller;

import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.shopping.domain.WxUserAwardRecord;
import com.zzhy.shopping.service.LotteryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiangKai
 * @date 2022/9/7 10:47
 */
@RestController
@RequestMapping("/shopping/lottery")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LotteryController {

    final LotteryService lotteryService;

    @GetMapping("/{uid}")
    public AjaxResult lottery(@PathVariable Long uid, @RequestParam("turnTableId") Long turnTableId) {
        WxUserAwardRecord record = lotteryService.lottery(uid, turnTableId);
        if (null != record)
            return AjaxResult.success(record);
        return AjaxResult.error("奖池已空,无法抽奖");
    }
}
