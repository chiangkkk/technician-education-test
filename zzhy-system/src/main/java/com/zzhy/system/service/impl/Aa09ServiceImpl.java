package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Aa09Mapper;
import com.zzhy.system.domain.Aa09;
import com.zzhy.system.service.IAa09Service;

/**
 * 代码类型Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Aa09ServiceImpl implements IAa09Service 
{
    @Autowired
    private Aa09Mapper aa09Mapper;

    /**
     * 查询代码类型
     * 
     * @param aaa100 代码类型主键
     * @return 代码类型
     */
    @Override
    public Aa09 selectAa09ByAaa100(String aaa100)
    {
        return aa09Mapper.selectAa09ByAaa100(aaa100);
    }

    /**
     * 查询代码类型列表
     * 
     * @param aa09 代码类型
     * @return 代码类型
     */
    @Override
    public List<Aa09> selectAa09List(Aa09 aa09)
    {
        return aa09Mapper.selectAa09List(aa09);
    }

    /**
     * 新增代码类型
     * 
     * @param aa09 代码类型
     * @return 结果
     */
    @Override
    public int insertAa09(Aa09 aa09)
    {
        return aa09Mapper.insertAa09(aa09);
    }

    /**
     * 修改代码类型
     * 
     * @param aa09 代码类型
     * @return 结果
     */
    @Override
    public int updateAa09(Aa09 aa09)
    {
        return aa09Mapper.updateAa09(aa09);
    }

    /**
     * 批量删除代码类型
     * 
     * @param aaa100s 需要删除的代码类型主键
     * @return 结果
     */
    @Override
    public int deleteAa09ByAaa100s(String[] aaa100s)
    {
        return aa09Mapper.deleteAa09ByAaa100s(aaa100s);
    }

    /**
     * 删除代码类型信息
     * 
     * @param aaa100 代码类型主键
     * @return 结果
     */
    @Override
    public int deleteAa09ByAaa100(String aaa100)
    {
        return aa09Mapper.deleteAa09ByAaa100(aaa100);
    }
}
