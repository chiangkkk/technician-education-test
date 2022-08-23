package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Ga06;

/**
 * 免学费标准Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Ga06Mapper 
{
    /**
     * 查询免学费标准
     * 
     * @param age542 免学费标准主键
     * @return 免学费标准
     */
    public Ga06 selectGa06ByAge542(String age542);

    /**
     * 查询免学费标准列表
     * 
     * @param ga06 免学费标准
     * @return 免学费标准集合
     */
    public List<Ga06> selectGa06List(Ga06 ga06);

    /**
     * 新增免学费标准
     * 
     * @param ga06 免学费标准
     * @return 结果
     */
    public int insertGa06(Ga06 ga06);

    /**
     * 修改免学费标准
     * 
     * @param ga06 免学费标准
     * @return 结果
     */
    public int updateGa06(Ga06 ga06);

    /**
     * 删除免学费标准
     * 
     * @param age542 免学费标准主键
     * @return 结果
     */
    public int deleteGa06ByAge542(String age542);

    /**
     * 批量删除免学费标准
     * 
     * @param age542s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGa06ByAge542s(String[] age542s);

    /**
     * 批量插入数据库
     * @param ga06List
     * @return
     */
    int insertBatchGa06(List<Ga06> ga06List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGa06();
}
