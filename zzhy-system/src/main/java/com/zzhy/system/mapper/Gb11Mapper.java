package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gb11;

/**
 * 技工院校信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gb11Mapper 
{
    /**
     * 查询技工院校信息
     * 
     * @param agb020 技工院校信息主键
     * @return 技工院校信息
     */
    public Gb11 selectGb11ByAgb020(String agb020);

    /**
     * 查询技工院校信息列表
     * 
     * @param gb11 技工院校信息
     * @return 技工院校信息集合
     */
    public List<Gb11> selectGb11List(Gb11 gb11);

    /**
     * 新增技工院校信息
     * 
     * @param gb11 技工院校信息
     * @return 结果
     */
    public int insertGb11(Gb11 gb11);

    /**
     * 修改技工院校信息
     * 
     * @param gb11 技工院校信息
     * @return 结果
     */
    public int updateGb11(Gb11 gb11);

    /**
     * 删除技工院校信息
     * 
     * @param agb020 技工院校信息主键
     * @return 结果
     */
    public int deleteGb11ByAgb020(String agb020);

    /**
     * 批量删除技工院校信息
     * 
     * @param agb020s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGb11ByAgb020s(String[] agb020s);

    /**
     * 批量插入数据库
     * @param gb11List
     * @return
     */
    int insertBatchGb11(List<Gb11> gb11List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGb11();
}
