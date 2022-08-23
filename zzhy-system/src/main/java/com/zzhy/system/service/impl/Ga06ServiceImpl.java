package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Ga06Mapper;
import com.zzhy.system.domain.Ga06;
import com.zzhy.system.service.IGa06Service;

/**
 * 免学费标准Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Ga06ServiceImpl implements IGa06Service 
{
    @Autowired
    private Ga06Mapper ga06Mapper;

    /**
     * 查询免学费标准
     * 
     * @param age542 免学费标准主键
     * @return 免学费标准
     */
    @Override
    public Ga06 selectGa06ByAge542(String age542)
    {
        return ga06Mapper.selectGa06ByAge542(age542);
    }

    /**
     * 查询免学费标准列表
     * 
     * @param ga06 免学费标准
     * @return 免学费标准
     */
    @Override
    public List<Ga06> selectGa06List(Ga06 ga06)
    {
        return ga06Mapper.selectGa06List(ga06);
    }

    /**
     * 新增免学费标准
     * 
     * @param ga06 免学费标准
     * @return 结果
     */
    @Override
    public int insertGa06(Ga06 ga06)
    {
        return ga06Mapper.insertGa06(ga06);
    }

    /**
     * 修改免学费标准
     * 
     * @param ga06 免学费标准
     * @return 结果
     */
    @Override
    public int updateGa06(Ga06 ga06)
    {
        return ga06Mapper.updateGa06(ga06);
    }

    /**
     * 批量删除免学费标准
     * 
     * @param age542s 需要删除的免学费标准主键
     * @return 结果
     */
    @Override
    public int deleteGa06ByAge542s(String[] age542s)
    {
        return ga06Mapper.deleteGa06ByAge542s(age542s);
    }

    /**
     * 删除免学费标准信息
     * 
     * @param age542 免学费标准主键
     * @return 结果
     */
    @Override
    public int deleteGa06ByAge542(String age542)
    {
        return ga06Mapper.deleteGa06ByAge542(age542);
    }
}
