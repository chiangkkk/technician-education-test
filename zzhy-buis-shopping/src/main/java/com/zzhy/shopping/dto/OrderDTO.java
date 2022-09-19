package com.zzhy.shopping.dto;

import com.zzhy.shopping.domain.NideshopOrder;
import com.zzhy.shopping.domain.NideshopOrderGoods;
import com.zzhy.shopping.domain.NideshopOrderPay;
import com.zzhy.shopping.domain.NideshopUser;
import lombok.Data;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/16 17:29
 */
@Data
public class OrderDTO extends NideshopOrder {

    private List<NideshopOrderGoods> goodsList;

    private NideshopOrderPay pay;

    private NideshopUser user;
}
