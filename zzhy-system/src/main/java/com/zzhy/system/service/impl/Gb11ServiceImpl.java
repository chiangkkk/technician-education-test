package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gb11Mapper;
import com.zzhy.system.domain.Gb11;
import com.zzhy.system.service.IGb11Service;

/**
 * 技工院校信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gb11ServiceImpl implements IGb11Service 
{
    @Autowired
    private Gb11Mapper gb11Mapper;

    /**
     * 查询技工院校信息
     * 
     * @param agb020 技工院校信息主键
     * @return 技工院校信息
     */
    @Override
    public Gb11 selectGb11ByAgb020(String agb020)
    {
        return gb11Mapper.selectGb11ByAgb020(agb020);
    }

    /**
     * 查询技工院校信息列表
     * 
     * @param gb11 技工院校信息
     * @return 技工院校信息
     */
    @Override
    public List<Gb11> selectGb11List(Gb11 gb11)
    {
        return gb11Mapper.selectGb11List(gb11);
    }

    /**
     * 新增技工院校信息
     * 
     * @param gb11 技工院校信息
     * @return 结果
     */
    @Override
    public int insertGb11(Gb11 gb11)
    {
        return gb11Mapper.insertGb11(gb11);
    }

    /**
     * 修改技工院校信息
     * 
     * @param gb11 技工院校信息
     * @return 结果
     */
    @Override
    public int updateGb11(Gb11 gb11)
    {
        return gb11Mapper.updateGb11(gb11);
    }

    /**
     * 批量删除技工院校信息
     * 
     * @param agb020s 需要删除的技工院校信息主键
     * @return 结果
     */
    @Override
    public int deleteGb11ByAgb020s(String[] agb020s)
    {
        return gb11Mapper.deleteGb11ByAgb020s(agb020s);
    }

    /**
     * 删除技工院校信息信息
     * 
     * @param agb020 技工院校信息主键
     * @return 结果
     */
    @Override
    public int deleteGb11ByAgb020(String agb020)
    {
        return gb11Mapper.deleteGb11ByAgb020(agb020);
    }
}
