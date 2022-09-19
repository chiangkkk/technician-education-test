package com.zzhy.shopping.service.impl;

import com.zzhy.shopping.domain.NideshopOrder;
import com.zzhy.shopping.dto.OrderDTO;
import com.zzhy.shopping.mapper.NideshopOrderMapper;
import com.zzhy.shopping.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/16 17:36
 */
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class OrderServiceImpl implements OrderService {

    final NideshopOrderMapper orderMapper;

    @Override
    public List<OrderDTO> getList(NideshopOrder order) {
        return orderMapper.selectByAll(order);
    }

    @Override
    public OrderDTO getOne(Long oid) {
        return orderMapper.selectOneToGetDTOById(oid);
    }
}
