package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gc60;

/**
 * 学籍异动信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGc60Service 
{
    /**
     * 查询学籍异动信息
     * 
     * @param age548 学籍异动信息主键
     * @return 学籍异动信息
     */
    public Gc60 selectGc60ByAge548(String age548);

    /**
     * 查询学籍异动信息列表
     * 
     * @param gc60 学籍异动信息
     * @return 学籍异动信息集合
     */
    public List<Gc60> selectGc60List(Gc60 gc60);

    /**
     * 新增学籍异动信息
     * 
     * @param gc60 学籍异动信息
     * @return 结果
     */
    public int insertGc60(Gc60 gc60);

    /**
     * 修改学籍异动信息
     * 
     * @param gc60 学籍异动信息
     * @return 结果
     */
    public int updateGc60(Gc60 gc60);

    /**
     * 批量删除学籍异动信息
     * 
     * @param age548s 需要删除的学籍异动信息主键集合
     * @return 结果
     */
    public int deleteGc60ByAge548s(String[] age548s);

    /**
     * 删除学籍异动信息信息
     * 
     * @param age548 学籍异动信息主键
     * @return 结果
     */
    public int deleteGc60ByAge548(String age548);
}
