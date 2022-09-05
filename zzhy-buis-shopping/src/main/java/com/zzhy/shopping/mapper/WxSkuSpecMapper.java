package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxSkuSpec;

public interface WxSkuSpecMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxSkuSpec record);

    int insertSelective(WxSkuSpec record);

    WxSkuSpec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxSkuSpec record);

    int updateByPrimaryKey(WxSkuSpec record);
}