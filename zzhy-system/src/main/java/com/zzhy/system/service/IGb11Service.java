package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gb11;

/**
 * 技工院校信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGb11Service 
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
     * 批量删除技工院校信息
     * 
     * @param agb020s 需要删除的技工院校信息主键集合
     * @return 结果
     */
    public int deleteGb11ByAgb020s(String[] agb020s);

    /**
     * 删除技工院校信息信息
     * 
     * @param agb020 技工院校信息主键
     * @return 结果
     */
    public int deleteGb11ByAgb020(String agb020);
}
