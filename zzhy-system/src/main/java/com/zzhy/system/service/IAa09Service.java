package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Aa09;

/**
 * 代码类型Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IAa09Service 
{
    /**
     * 查询代码类型
     * 
     * @param aaa100 代码类型主键
     * @return 代码类型
     */
    public Aa09 selectAa09ByAaa100(String aaa100);

    /**
     * 查询代码类型列表
     * 
     * @param aa09 代码类型
     * @return 代码类型集合
     */
    public List<Aa09> selectAa09List(Aa09 aa09);

    /**
     * 新增代码类型
     * 
     * @param aa09 代码类型
     * @return 结果
     */
    public int insertAa09(Aa09 aa09);

    /**
     * 修改代码类型
     * 
     * @param aa09 代码类型
     * @return 结果
     */
    public int updateAa09(Aa09 aa09);

    /**
     * 批量删除代码类型
     * 
     * @param aaa100s 需要删除的代码类型主键集合
     * @return 结果
     */
    public int deleteAa09ByAaa100s(String[] aaa100s);

    /**
     * 删除代码类型信息
     * 
     * @param aaa100 代码类型主键
     * @return 结果
     */
    public int deleteAa09ByAaa100(String aaa100);
}
