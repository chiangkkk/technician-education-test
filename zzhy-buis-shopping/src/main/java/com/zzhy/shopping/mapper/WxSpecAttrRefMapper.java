package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxSpecAttrRef;

public interface WxSpecAttrRefMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxSpecAttrRef record);

    int insertSelective(WxSpecAttrRef record);

    WxSpecAttrRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxSpecAttrRef record);

    int updateByPrimaryKey(WxSpecAttrRef record);
}