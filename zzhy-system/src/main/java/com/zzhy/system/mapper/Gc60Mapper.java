package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc60;

/**
 * 学籍异动信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gc60Mapper 
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
     * 删除学籍异动信息
     * 
     * @param age548 学籍异动信息主键
     * @return 结果
     */
    public int deleteGc60ByAge548(String age548);

    /**
     * 批量删除学籍异动信息
     * 
     * @param age548s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc60ByAge548s(String[] age548s);

    /**
     * 批量插入数据库
     * @param gc60List
     * @return
     */
    int insertBatchGc60(List<Gc60> gc60List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc60();
}
