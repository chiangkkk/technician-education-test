package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Aa10;

/**
 * 代码Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Aa10Mapper 
{
    /**
     * 查询代码
     * 
     * @param aaa100 代码主键
     * @return 代码
     */
    public Aa10 selectAa10ByAaa100(String aaa100);

    /**
     * 查询代码列表
     * 
     * @param aa10 代码
     * @return 代码集合
     */
    public List<Aa10> selectAa10List(Aa10 aa10);

    /**
     * 新增代码
     * 
     * @param aa10 代码
     * @return 结果
     */
    public int insertAa10(Aa10 aa10);

    /**
     * 修改代码
     * 
     * @param aa10 代码
     * @return 结果
     */
    public int updateAa10(Aa10 aa10);

    /**
     * 删除代码
     * 
     * @param aaa100 代码主键
     * @return 结果
     */
    public int deleteAa10ByAaa100(String aaa100);

    /**
     * 批量删除代码
     * 
     * @param aaa100s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAa10ByAaa100s(String[] aaa100s);

    /**
     * 批量插入数据库
     * @param aa10List
     * @return
     */
    int insertBatchAa10(List<Aa10> aa10List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllAa10();
}
