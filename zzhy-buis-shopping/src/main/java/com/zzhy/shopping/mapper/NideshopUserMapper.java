package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.NideshopUser;

public interface NideshopUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NideshopUser record);

    int insertSelective(NideshopUser record);

    NideshopUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopUser record);

    int updateByPrimaryKey(NideshopUser record);
}