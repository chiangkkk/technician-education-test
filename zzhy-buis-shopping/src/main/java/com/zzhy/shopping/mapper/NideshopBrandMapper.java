package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.NideshopBrand;

public interface NideshopBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NideshopBrand record);

    int insertSelective(NideshopBrand record);

    NideshopBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NideshopBrand record);

    int updateByPrimaryKey(NideshopBrand record);
}