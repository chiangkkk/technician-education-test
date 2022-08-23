package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc55Mapper;
import com.zzhy.system.domain.Gc55;
import com.zzhy.system.service.IGc55Service;

/**
 * 就业信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc55ServiceImpl implements IGc55Service 
{
    @Autowired
    private Gc55Mapper gc55Mapper;

    /**
     * 查询就业信息
     * 
     * @param age534 就业信息主键
     * @return 就业信息
     */
    @Override
    public Gc55 selectGc55ByAge534(String age534)
    {
        return gc55Mapper.selectGc55ByAge534(age534);
    }

    /**
     * 查询就业信息列表
     * 
     * @param gc55 就业信息
     * @return 就业信息
     */
    @Override
    public List<Gc55> selectGc55List(Gc55 gc55)
    {
        return gc55Mapper.selectGc55List(gc55);
    }

    /**
     * 新增就业信息
     * 
     * @param gc55 就业信息
     * @return 结果
     */
    @Override
    public int insertGc55(Gc55 gc55)
    {
        return gc55Mapper.insertGc55(gc55);
    }

    /**
     * 修改就业信息
     * 
     * @param gc55 就业信息
     * @return 结果
     */
    @Override
    public int updateGc55(Gc55 gc55)
    {
        return gc55Mapper.updateGc55(gc55);
    }

    /**
     * 批量删除就业信息
     * 
     * @param age534s 需要删除的就业信息主键
     * @return 结果
     */
    @Override
    public int deleteGc55ByAge534s(String[] age534s)
    {
        return gc55Mapper.deleteGc55ByAge534s(age534s);
    }

    /**
     * 删除就业信息信息
     * 
     * @param age534 就业信息主键
     * @return 结果
     */
    @Override
    public int deleteGc55ByAge534(String age534)
    {
        return gc55Mapper.deleteGc55ByAge534(age534);
    }
}
