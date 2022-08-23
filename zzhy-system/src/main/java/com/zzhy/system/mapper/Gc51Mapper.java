package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc51;

/**
 * 学籍信息Mapper接口
 * 
 * @author zzhy
 * @date 2022-05-30
 */
public interface Gc51Mapper 
{
    /**
     * 查询学籍信息
     * 
     * @param agc156 学籍信息主键
     * @return 学籍信息
     */
    public Gc51 selectGc51ByAgc156(String agc156);

    /**
     * 查询学籍信息列表
     * 
     * @param gc51 学籍信息
     * @return 学籍信息集合
     */
    public List<Gc51> selectGc51List(Gc51 gc51);

    /**
     * 新增学籍信息
     * 
     * @param gc51 学籍信息
     * @return 结果
     */
    public int insertGc51(Gc51 gc51);

    /**
     * 修改学籍信息
     * 
     * @param gc51 学籍信息
     * @return 结果
     */
    public int updateGc51(Gc51 gc51);

    /**
     * 删除学籍信息
     * 
     * @param agc156 学籍信息主键
     * @return 结果
     */
    public int deleteGc51ByAgc156(String agc156);

    /**
     * 批量删除学籍信息
     * 
     * @param agc156s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc51ByAgc156s(String[] agc156s);

    /**
     * 批量插入数据库
     * @param gc51List
     * @return
     */
    int insertBatchGc51(List<Gc51> gc51List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc51();
}
