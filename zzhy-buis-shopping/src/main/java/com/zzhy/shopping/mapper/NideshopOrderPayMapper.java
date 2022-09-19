package com.zzhy.shopping.mapper;
import org.apache.ibatis.annotations.Param;

import com.zzhy.shopping.domain.NideshopOrderPay;

public interface NideshopOrderPayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NideshopOrderPay record);

    int insertSelective(NideshopOrderPay record);

    NideshopOrderPay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopOrderPay record);

    int updateByPrimaryKey(NideshopOrderPay record);

    NideshopOrderPay getOneByOrderId(@Param("orderId")Long orderId);


}