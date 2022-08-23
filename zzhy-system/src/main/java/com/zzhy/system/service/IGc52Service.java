package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gc52;

/**
 * 免学费信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGc52Service 
{
    /**
     * 查询免学费信息
     * 
     * @param age521 免学费信息主键
     * @return 免学费信息
     */
    public Gc52 selectGc52ByAge521(String age521);

    /**
     * 查询免学费信息列表
     * 
     * @param gc52 免学费信息
     * @return 免学费信息集合
     */
    public List<Gc52> selectGc52List(Gc52 gc52);

    /**
     * 新增免学费信息
     * 
     * @param gc52 免学费信息
     * @return 结果
     */
    public int insertGc52(Gc52 gc52);

    /**
     * 修改免学费信息
     * 
     * @param gc52 免学费信息
     * @return 结果
     */
    public int updateGc52(Gc52 gc52);

    /**
     * 批量删除免学费信息
     * 
     * @param age521s 需要删除的免学费信息主键集合
     * @return 结果
     */
    public int deleteGc52ByAge521s(String[] age521s);

    /**
     * 删除免学费信息信息
     * 
     * @param age521 免学费信息主键
     * @return 结果
     */
    public int deleteGc52ByAge521(String age521);
}
