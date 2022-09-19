package com.zzhy.shopping.service;

import com.zzhy.shopping.domain.NideshopOrder;
import com.zzhy.shopping.dto.OrderDTO;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/16 17:32
 */
public interface OrderService {

    List<OrderDTO> getList(NideshopOrder order);

    OrderDTO getOne(Long oid);
}
