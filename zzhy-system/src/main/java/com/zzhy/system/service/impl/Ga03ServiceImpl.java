package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Ga03Mapper;
import com.zzhy.system.domain.Ga03;
import com.zzhy.system.service.IGa03Service;

/**
 * 专业信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Ga03ServiceImpl implements IGa03Service 
{
    @Autowired
    private Ga03Mapper ga03Mapper;

    /**
     * 查询专业信息
     * 
     * @param aae100 专业信息主键
     * @return 专业信息
     */
    @Override
    public Ga03 selectGa03ByAae100(String aae100)
    {
        return ga03Mapper.selectGa03ByAae100(aae100);
    }

    /**
     * 查询专业信息列表
     * 
     * @param ga03 专业信息
     * @return 专业信息
     */
    @Override
    public List<Ga03> selectGa03List(Ga03 ga03)
    {
        return ga03Mapper.selectGa03List(ga03);
    }

    /**
     * 新增专业信息
     * 
     * @param ga03 专业信息
     * @return 结果
     */
    @Override
    public int insertGa03(Ga03 ga03)
    {
        return ga03Mapper.insertGa03(ga03);
    }

    /**
     * 修改专业信息
     * 
     * @param ga03 专业信息
     * @return 结果
     */
    @Override
    public int updateGa03(Ga03 ga03)
    {
        return ga03Mapper.updateGa03(ga03);
    }

    /**
     * 批量删除专业信息
     * 
     * @param aae100s 需要删除的专业信息主键
     * @return 结果
     */
    @Override
    public int deleteGa03ByAae100s(String[] aae100s)
    {
        return ga03Mapper.deleteGa03ByAae100s(aae100s);
    }

    /**
     * 删除专业信息信息
     * 
     * @param aae100 专业信息主键
     * @return 结果
     */
    @Override
    public int deleteGa03ByAae100(String aae100)
    {
        return ga03Mapper.deleteGa03ByAae100(aae100);
    }
}
