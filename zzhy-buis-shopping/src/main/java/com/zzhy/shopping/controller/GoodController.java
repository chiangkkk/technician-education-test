package com.zzhy.shopping.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiangKai
 * @date 2022/9/5 17:15
 */
@RestController
@RequestMapping("/shopping/goods")
public class GoodController  extends BaseController {

    @Autowired
    GoodsService goodsService;


    @GetMapping("/list")
    public TableDataInfo getGoods(){
        startPage();
        return getDataTable(goodsService.getGoodsWithSku(new WxGoods()));
    }
}
