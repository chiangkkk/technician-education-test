package com.zzhy.shopping.service.impl;

import com.zzhy.shopping.domain.NideshopUser;
import com.zzhy.shopping.mapper.NideshopUserMapper;
import com.zzhy.shopping.service.NideshopUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class NideshopUserServiceImpl implements NideshopUserService{

    @Resource
    private NideshopUserMapper nideshopUserMapper;

    @Override
    public int insertSelective(NideshopUser record) {
        return nideshopUserMapper.insertSelective(record);
    }

    @Override
    public NideshopUser selectByPrimaryKey(Long id) {
        return nideshopUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(NideshopUser record) {
        return nideshopUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(NideshopUser record) {
        return nideshopUserMapper.updateByPrimaryKey(record);
    }

}
