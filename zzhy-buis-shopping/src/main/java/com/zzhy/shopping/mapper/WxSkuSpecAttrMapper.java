package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxSkuSpecAttr;

public interface WxSkuSpecAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxSkuSpecAttr record);

    int insertSelective(WxSkuSpecAttr record);

    WxSkuSpecAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxSkuSpecAttr record);

    int updateByPrimaryKey(WxSkuSpecAttr record);
}