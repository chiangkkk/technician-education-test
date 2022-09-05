package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxGoods;

public interface WxGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxGoods record);

    int insertSelective(WxGoods record);

    WxGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxGoods record);

    int updateByPrimaryKey(WxGoods record);
}