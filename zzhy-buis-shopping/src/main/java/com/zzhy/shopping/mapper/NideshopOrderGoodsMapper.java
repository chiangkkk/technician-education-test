package com.zzhy.shopping.mapper;
import org.apache.ibatis.annotations.Param;

import com.zzhy.shopping.domain.NideshopOrderGoods;

import java.util.List;

public interface NideshopOrderGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NideshopOrderGoods record);

    int insertSelective(NideshopOrderGoods record);

    NideshopOrderGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopOrderGoods record);

    int updateByPrimaryKey(NideshopOrderGoods record);


    List<NideshopOrderGoods> selectByGoodsId(@Param("goodsId")Long goodsId);


    NideshopOrderGoods selectOneByOrderId(@Param("orderId")Long orderId);



}