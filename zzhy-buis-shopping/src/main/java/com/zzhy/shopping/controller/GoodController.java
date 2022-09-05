package com.zzhy.shopping.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.page.TableDataInfo;
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



    @GetMapping("/list")
    public TableDataInfo getGoods(){
        startPage();
        return getDataTable(null);
    }
}
