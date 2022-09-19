package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxStoreYly;

public interface WxStoreYlyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxStoreYly record);

    int insertSelective(WxStoreYly record);

    WxStoreYly selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxStoreYly record);

    int updateByPrimaryKey(WxStoreYly record);
}