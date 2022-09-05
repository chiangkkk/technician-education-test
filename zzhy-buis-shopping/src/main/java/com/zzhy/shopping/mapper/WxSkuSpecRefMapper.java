package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxSkuSpecRef;

public interface WxSkuSpecRefMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxSkuSpecRef record);

    int insertSelective(WxSkuSpecRef record);

    WxSkuSpecRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxSkuSpecRef record);

    int updateByPrimaryKey(WxSkuSpecRef record);
}