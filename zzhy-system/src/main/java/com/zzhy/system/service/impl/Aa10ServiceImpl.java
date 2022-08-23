package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Aa10Mapper;
import com.zzhy.system.domain.Aa10;
import com.zzhy.system.service.IAa10Service;

/**
 * 代码Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Aa10ServiceImpl implements IAa10Service 
{
    @Autowired
    private Aa10Mapper aa10Mapper;

    /**
     * 查询代码
     * 
     * @param aaa100 代码主键
     * @return 代码
     */
    @Override
    public Aa10 selectAa10ByAaa100(String aaa100)
    {
        return aa10Mapper.selectAa10ByAaa100(aaa100);
    }

    /**
     * 查询代码列表
     * 
     * @param aa10 代码
     * @return 代码
     */
    @Override
    public List<Aa10> selectAa10List(Aa10 aa10)
    {
        return aa10Mapper.selectAa10List(aa10);
    }

    /**
     * 新增代码
     * 
     * @param aa10 代码
     * @return 结果
     */
    @Override
    public int insertAa10(Aa10 aa10)
    {
        return aa10Mapper.insertAa10(aa10);
    }

    /**
     * 修改代码
     * 
     * @param aa10 代码
     * @return 结果
     */
    @Override
    public int updateAa10(Aa10 aa10)
    {
        return aa10Mapper.updateAa10(aa10);
    }

    /**
     * 批量删除代码
     * 
     * @param aaa100s 需要删除的代码主键
     * @return 结果
     */
    @Override
    public int deleteAa10ByAaa100s(String[] aaa100s)
    {
        return aa10Mapper.deleteAa10ByAaa100s(aaa100s);
    }

    /**
     * 删除代码信息
     * 
     * @param aaa100 代码主键
     * @return 结果
     */
    @Override
    public int deleteAa10ByAaa100(String aaa100)
    {
        return aa10Mapper.deleteAa10ByAaa100(aaa100);
    }
}
