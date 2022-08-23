package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc51Mapper;
import com.zzhy.system.domain.Gc51;
import com.zzhy.system.service.IGc51Service;

/**
 * 学籍信息Service业务层处理
 * 
 * @author zzhy
 * @date 2022-05-30
 */
@Service
public class Gc51ServiceImpl implements IGc51Service 
{
    @Autowired
    private Gc51Mapper gc51Mapper;

    /**
     * 查询学籍信息
     * 
     * @param agc156 学籍信息主键
     * @return 学籍信息
     */
    @Override
    public Gc51 selectGc51ByAgc156(String agc156)
    {
        return gc51Mapper.selectGc51ByAgc156(agc156);
    }

    /**
     * 查询学籍信息列表
     * 
     * @param gc51 学籍信息
     * @return 学籍信息
     */
    @Override
    public List<Gc51> selectGc51List(Gc51 gc51)
    {
        return gc51Mapper.selectGc51List(gc51);
    }

    /**
     * 新增学籍信息
     * 
     * @param gc51 学籍信息
     * @return 结果
     */
    @Override
    public int insertGc51(Gc51 gc51)
    {
        return gc51Mapper.insertGc51(gc51);
    }

    /**
     * 修改学籍信息
     * 
     * @param gc51 学籍信息
     * @return 结果
     */
    @Override
    public int updateGc51(Gc51 gc51)
    {
        return gc51Mapper.updateGc51(gc51);
    }

    /**
     * 批量删除学籍信息
     * 
     * @param agc156s 需要删除的学籍信息主键
     * @return 结果
     */
    @Override
    public int deleteGc51ByAgc156s(String[] agc156s)
    {
        return gc51Mapper.deleteGc51ByAgc156s(agc156s);
    }

    /**
     * 删除学籍信息信息
     * 
     * @param agc156 学籍信息主键
     * @return 结果
     */
    @Override
    public int deleteGc51ByAgc156(String agc156)
    {
        return gc51Mapper.deleteGc51ByAgc156(agc156);
    }
}
