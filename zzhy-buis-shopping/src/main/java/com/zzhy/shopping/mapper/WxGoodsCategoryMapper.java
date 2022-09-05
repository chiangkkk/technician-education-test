package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxGoodsCategory;

public interface WxGoodsCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxGoodsCategory record);

    int insertSelective(WxGoodsCategory record);

    WxGoodsCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxGoodsCategory record);

    int updateByPrimaryKey(WxGoodsCategory record);
}