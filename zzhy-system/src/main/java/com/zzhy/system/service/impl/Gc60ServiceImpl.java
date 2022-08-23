package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc60Mapper;
import com.zzhy.system.domain.Gc60;
import com.zzhy.system.service.IGc60Service;

/**
 * 学籍异动信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc60ServiceImpl implements IGc60Service 
{
    @Autowired
    private Gc60Mapper gc60Mapper;

    /**
     * 查询学籍异动信息
     * 
     * @param age548 学籍异动信息主键
     * @return 学籍异动信息
     */
    @Override
    public Gc60 selectGc60ByAge548(String age548)
    {
        return gc60Mapper.selectGc60ByAge548(age548);
    }

    /**
     * 查询学籍异动信息列表
     * 
     * @param gc60 学籍异动信息
     * @return 学籍异动信息
     */
    @Override
    public List<Gc60> selectGc60List(Gc60 gc60)
    {
        return gc60Mapper.selectGc60List(gc60);
    }

    /**
     * 新增学籍异动信息
     * 
     * @param gc60 学籍异动信息
     * @return 结果
     */
    @Override
    public int insertGc60(Gc60 gc60)
    {
        return gc60Mapper.insertGc60(gc60);
    }

    /**
     * 修改学籍异动信息
     * 
     * @param gc60 学籍异动信息
     * @return 结果
     */
    @Override
    public int updateGc60(Gc60 gc60)
    {
        return gc60Mapper.updateGc60(gc60);
    }

    /**
     * 批量删除学籍异动信息
     * 
     * @param age548s 需要删除的学籍异动信息主键
     * @return 结果
     */
    @Override
    public int deleteGc60ByAge548s(String[] age548s)
    {
        return gc60Mapper.deleteGc60ByAge548s(age548s);
    }

    /**
     * 删除学籍异动信息信息
     * 
     * @param age548 学籍异动信息主键
     * @return 结果
     */
    @Override
    public int deleteGc60ByAge548(String age548)
    {
        return gc60Mapper.deleteGc60ByAge548(age548);
    }
}
