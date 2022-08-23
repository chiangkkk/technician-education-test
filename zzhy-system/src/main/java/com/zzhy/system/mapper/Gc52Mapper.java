package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc52;

/**
 * 免学费信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gc52Mapper 
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
     * 删除免学费信息
     * 
     * @param age521 免学费信息主键
     * @return 结果
     */
    public int deleteGc52ByAge521(String age521);

    /**
     * 批量删除免学费信息
     * 
     * @param age521s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc52ByAge521s(String[] age521s);

    /**
     * 批量插入数据库
     * @param gc52List
     * @return
     */
    int insertBatchGc52(List<Gc52> gc52List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc52();
}
