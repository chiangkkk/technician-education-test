package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc56Mapper;
import com.zzhy.system.domain.Gc56;
import com.zzhy.system.service.IGc56Service;

/**
 * 职业资格证书Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc56ServiceImpl implements IGc56Service 
{
    @Autowired
    private Gc56Mapper gc56Mapper;

    /**
     * 查询职业资格证书
     * 
     * @param agc163 职业资格证书主键
     * @return 职业资格证书
     */
    @Override
    public Gc56 selectGc56ByAgc163(String agc163)
    {
        return gc56Mapper.selectGc56ByAgc163(agc163);
    }

    /**
     * 查询职业资格证书列表
     * 
     * @param gc56 职业资格证书
     * @return 职业资格证书
     */
    @Override
    public List<Gc56> selectGc56List(Gc56 gc56)
    {
        return gc56Mapper.selectGc56List(gc56);
    }

    /**
     * 新增职业资格证书
     * 
     * @param gc56 职业资格证书
     * @return 结果
     */
    @Override
    public int insertGc56(Gc56 gc56)
    {
        return gc56Mapper.insertGc56(gc56);
    }

    /**
     * 修改职业资格证书
     * 
     * @param gc56 职业资格证书
     * @return 结果
     */
    @Override
    public int updateGc56(Gc56 gc56)
    {
        return gc56Mapper.updateGc56(gc56);
    }

    /**
     * 批量删除职业资格证书
     * 
     * @param agc163s 需要删除的职业资格证书主键
     * @return 结果
     */
    @Override
    public int deleteGc56ByAgc163s(String[] agc163s)
    {
        return gc56Mapper.deleteGc56ByAgc163s(agc163s);
    }

    /**
     * 删除职业资格证书信息
     * 
     * @param agc163 职业资格证书主键
     * @return 结果
     */
    @Override
    public int deleteGc56ByAgc163(String agc163)
    {
        return gc56Mapper.deleteGc56ByAgc163(agc163);
    }
}
