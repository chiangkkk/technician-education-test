package com.zzhy.shopping.controller;

import com.zzhy.shopping.service.LotteryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
