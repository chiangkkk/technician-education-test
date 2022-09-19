package com.zzhy.shopping.controller;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.common.utils.StringUtils;
import com.zzhy.shopping.domain.NideshopOrder;
import com.zzhy.shopping.domain.NideshopOrderGoods;
import com.zzhy.shopping.dto.OrderDTO;
import com.zzhy.shopping.mapper.NideshopUserMapper;
import com.zzhy.shopping.service.OrderService;
import com.zzhy.shopping.utils.YlyPrintUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/15 16:26
 */
@RestController
@RequestMapping("/shopping/order")
@AllArgsConstructor
@Slf4j
public class OrderController extends BaseController {

    final YlyPrintUtil ylyPrintUtil;

    final OrderService orderService;

    final NideshopUserMapper userMapper;


    @GetMapping("/list")
    public TableDataInfo list(NideshopOrder order) {
        startPage();
        long start = DateUtil.current();
        List<OrderDTO> list = orderService.getList(order);
        Console.log("consume time:{}", DateUtil.current() - start);
        return getDataTable(list);
    }

    @GetMapping("/print/{oid}")
    public AjaxResult printOrder(@PathVariable(value = "oid") Long oid) {
        NideshopOrder order = new NideshopOrder();
        order.setId(oid);
        OrderDTO orderDTO = orderService.getOne(oid);
        if (orderDTO == null) {
            return error("订单不存在");
        }
        print(orderDTO);
        return AjaxResult.success(orderDTO);
    }

    @GetMapping("/{oid}")
    public AjaxResult getOrder(@PathVariable(value = "oid") Long oid) {
        NideshopOrder order = new NideshopOrder();
        order.setId(oid);
        OrderDTO orderDTO = orderService.getOne(oid);
        if (orderDTO == null) {
            return error("订单不存在");
        }
        return AjaxResult.success(orderDTO);
    }

    @RequestMapping("/testPrint")
    public Object test() {
        String oid = "55865993142881767";
        return ylyPrintUtil.print("test", oid);
    }

    private void print(OrderDTO order) {
        YlyPrintUtil.MakePrintContent str = new YlyPrintUtil.MakePrintContent();

        str.F_48_48_B_C("NiderShop");
//        str.F_48_48_B("备注:顾客需要餐具");
        str.BR();
//        str.F_48_24("期望送达:立刻送达");
        str.appendLine("下单时间:" + DateUtil.format(order.getCreateTime(), DatePattern.NORM_DATETIME_PATTERN));
        str.BR();
        str.F_48_24("商品\t\t\t数量\t金额");
        str.BR();
        //FS2 16个英文字符
        str.append("<FS2>------", "口袋0", "-----</FS2>");
        str.BR();
        if (order.getGoodsList() != null && order.getGoodsList().size() >0){
            for (int i = 0; i < order.getGoodsList().size(); i++) {
                NideshopOrderGoods good = order.getGoodsList().get(i);
                str.F_48_24(good.getGoodsName()+"\t\t"+good.getNumber() +"\t" + good.getOriginalPrice());
                str.BR();
            }
        }
        str.appendLine("<FS2>----------------</FS2>");
        str.F_48_24("应收："+order.getOrderPrice());
        str.BR();
        str.appendLine("支付方式：在线支付");
        str.appendLine("顾客名称："+order.getConsignee());
        str.appendLine("顾客电话: "+order.getMobile());
//        str.appendLine("顾客电话: 17838010181_9993");
        str.appendLine("送餐时间：立即送达");
        str.appendLine("送餐地址: "+order.getAddress());
        str.F_48_24("交易号" + order.getOrderSn());
        str.BR();
        str.F_48_24("出餐条形码");
        str.BR();
        String pickUpCode = StringUtils.randomGen(11);
        str.code128(pickUpCode);
        ylyPrintUtil.print(str.toString(), order.getId().toString());
    }

    private String printTemplate(String oid) {
        YlyPrintUtil.MakePrintContent str = new YlyPrintUtil.MakePrintContent();

        str.F_48_48_B_C("美团(11)");
        str.F_48_48_B("备注:顾客需要餐具");
        str.BR();
        str.F_48_24("期望送达:立刻送达");
        str.BR();
        str.appendLine("下单时间:" + DateUtil.now());
        str.BR();
        str.F_48_24("商品\t\t\t数量\t金额");
        str.BR();
        //FS2 16个英文字符
        str.append("<FS2>------", "口袋0", "-----</FS2>");
        str.BR();
        str.F_48_24("自选四件套套餐\t\t1\t22.9");
        str.BR();
        str.appendLine("#辣味鸡肉卷，鸡米花，3个黑椒鸡块，中可");

        for (String s : new String[]{"辣味鸡肉卷", "劲脆鸡米花", "3个黑椒鸡块", "可乐（中）"}) {
            str.appendLine("[明细]" + s + " " + "1");
        }
        str.F_48_24("1个黑椒鸡块\t\t2\t0");
        str.BR();
        str.appendLine("<FS2>----------------</FS2>");
        str.appendLine("餐盒费：2.00");
        str.appendLine("配送费：5.00");
        str.F_48_24("应收：14.90");
        str.BR();
        str.appendLine("支付方式：在线支付");
        str.appendLine("顾客名称：陈（女士）");
        str.appendLine("顾客电话: 183****8010");
        str.appendLine("顾客电话: 17838010181_9993");
        str.appendLine("送餐时间：立即送达");
        str.appendLine("送餐地址:慧源创新科创园-D栋(联启科技)");
        str.F_48_24("交易号" + oid);
        str.BR();
        str.F_48_24("出餐条形码");
        str.BR();
        String pickUpCode = StringUtils.randomGen(11);
        str.code128(pickUpCode);
        String result = str.toString();
        return result;
    }


}
