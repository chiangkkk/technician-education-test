package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.NideshopUser;

public interface NideshopUserMapper {
    int insertSelective(NideshopUser record);

    NideshopUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopUser record);

    int updateByPrimaryKey(NideshopUser record);

}