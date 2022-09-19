package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.NideshopOrder;
import com.zzhy.shopping.dto.OrderDTO;

import java.util.List;

public interface NideshopOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NideshopOrder record);

    int insertSelective(NideshopOrder record);

    NideshopOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopOrder record);

    int updateByPrimaryKey(NideshopOrder record);

    List<OrderDTO> selectByAll(NideshopOrder nideshopOrder);


    OrderDTO selectOneToGetDTOById(Long oid);
}