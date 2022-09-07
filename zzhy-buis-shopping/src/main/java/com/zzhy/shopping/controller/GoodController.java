package com.zzhy.shopping.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.service.GoodsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiangKai
 * @date 2022/9/5 17:15
 */
@RestController
@RequestMapping("/shopping/goods")
@AllArgsConstructor
public class GoodController extends BaseController {

    private final GoodsService goodsService;


    @GetMapping("/list")
    public TableDataInfo getGoods(WxGoods wxGoods) {
        startPage();
        return getDataTable(goodsService.getGoodsWithSku(wxGoods));
    }
}
