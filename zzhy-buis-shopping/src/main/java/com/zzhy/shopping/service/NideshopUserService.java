package com.zzhy.shopping.service;

import com.zzhy.shopping.domain.NideshopUser;
public interface NideshopUserService{


    int insertSelective(NideshopUser record);

    NideshopUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopUser record);

    int updateByPrimaryKey(NideshopUser record);

}
