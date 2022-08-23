package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Ga06;

/**
 * 免学费标准Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGa06Service 
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
     * 批量删除免学费标准
     * 
     * @param age542s 需要删除的免学费标准主键集合
     * @return 结果
     */
    public int deleteGa06ByAge542s(String[] age542s);

    /**
     * 删除免学费标准信息
     * 
     * @param age542 免学费标准主键
     * @return 结果
     */
    public int deleteGa06ByAge542(String age542);
}
