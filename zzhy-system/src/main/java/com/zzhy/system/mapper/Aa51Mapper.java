package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Aa51;

/**
 * 行政区划Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Aa51Mapper 
{
    /**
     * 查询行政区划
     * 
     * @param aaa145 行政区划主键
     * @return 行政区划
     */
    public Aa51 selectAa51ByAaa145(String aaa145);

    /**
     * 查询行政区划列表
     * 
     * @param aa51 行政区划
     * @return 行政区划集合
     */
    public List<Aa51> selectAa51List(Aa51 aa51);

    /**
     * 新增行政区划
     * 
     * @param aa51 行政区划
     * @return 结果
     */
    public int insertAa51(Aa51 aa51);

    /**
     * 修改行政区划
     * 
     * @param aa51 行政区划
     * @return 结果
     */
    public int updateAa51(Aa51 aa51);

    /**
     * 删除行政区划
     * 
     * @param aaa145 行政区划主键
     * @return 结果
     */
    public int deleteAa51ByAaa145(String aaa145);

    /**
     * 批量删除行政区划
     * 
     * @param aaa145s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAa51ByAaa145s(String[] aaa145s);

    /**
     * 批量插入数据库
     * @param aa51List
     * @return
     */
    int insertBatchAa51(List<Aa51> aa51List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllAa51();
}
