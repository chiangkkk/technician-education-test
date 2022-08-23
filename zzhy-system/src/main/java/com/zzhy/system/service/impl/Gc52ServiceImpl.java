package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc52Mapper;
import com.zzhy.system.domain.Gc52;
import com.zzhy.system.service.IGc52Service;

/**
 * 免学费信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc52ServiceImpl implements IGc52Service 
{
    @Autowired
    private Gc52Mapper gc52Mapper;

    /**
     * 查询免学费信息
     * 
     * @param age521 免学费信息主键
     * @return 免学费信息
     */
    @Override
    public Gc52 selectGc52ByAge521(String age521)
    {
        return gc52Mapper.selectGc52ByAge521(age521);
    }

    /**
     * 查询免学费信息列表
     * 
     * @param gc52 免学费信息
     * @return 免学费信息
     */
    @Override
    public List<Gc52> selectGc52List(Gc52 gc52)
    {
        return gc52Mapper.selectGc52List(gc52);
    }

    /**
     * 新增免学费信息
     * 
     * @param gc52 免学费信息
     * @return 结果
     */
    @Override
    public int insertGc52(Gc52 gc52)
    {
        return gc52Mapper.insertGc52(gc52);
    }

    /**
     * 修改免学费信息
     * 
     * @param gc52 免学费信息
     * @return 结果
     */
    @Override
    public int updateGc52(Gc52 gc52)
    {
        return gc52Mapper.updateGc52(gc52);
    }

    /**
     * 批量删除免学费信息
     * 
     * @param age521s 需要删除的免学费信息主键
     * @return 结果
     */
    @Override
    public int deleteGc52ByAge521s(String[] age521s)
    {
        return gc52Mapper.deleteGc52ByAge521s(age521s);
    }

    /**
     * 删除免学费信息信息
     * 
     * @param age521 免学费信息主键
     * @return 结果
     */
    @Override
    public int deleteGc52ByAge521(String age521)
    {
        return gc52Mapper.deleteGc52ByAge521(age521);
    }
}
