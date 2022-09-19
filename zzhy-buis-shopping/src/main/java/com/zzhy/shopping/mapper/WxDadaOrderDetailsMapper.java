package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxDadaOrderDetails;

public interface WxDadaOrderDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxDadaOrderDetails record);

    int insertSelective(WxDadaOrderDetails record);

    WxDadaOrderDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxDadaOrderDetails record);

    int updateByPrimaryKey(WxDadaOrderDetails record);
}