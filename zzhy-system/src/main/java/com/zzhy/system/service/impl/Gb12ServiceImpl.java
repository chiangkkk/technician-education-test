package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gb12Mapper;
import com.zzhy.system.domain.Gb12;
import com.zzhy.system.service.IGb12Service;

/**
 * 教师信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gb12ServiceImpl implements IGb12Service 
{
    @Autowired
    private Gb12Mapper gb12Mapper;

    /**
     * 查询教师信息
     * 
     * @param agc153 教师信息主键
     * @return 教师信息
     */
    @Override
    public Gb12 selectGb12ByAgc153(String agc153)
    {
        return gb12Mapper.selectGb12ByAgc153(agc153);
    }

    /**
     * 查询教师信息列表
     * 
     * @param gb12 教师信息
     * @return 教师信息
     */
    @Override
    public List<Gb12> selectGb12List(Gb12 gb12)
    {
        return gb12Mapper.selectGb12List(gb12);
    }

    /**
     * 新增教师信息
     * 
     * @param gb12 教师信息
     * @return 结果
     */
    @Override
    public int insertGb12(Gb12 gb12)
    {
        return gb12Mapper.insertGb12(gb12);
    }

    /**
     * 修改教师信息
     * 
     * @param gb12 教师信息
     * @return 结果
     */
    @Override
    public int updateGb12(Gb12 gb12)
    {
        return gb12Mapper.updateGb12(gb12);
    }

    /**
     * 批量删除教师信息
     * 
     * @param agc153s 需要删除的教师信息主键
     * @return 结果
     */
    @Override
    public int deleteGb12ByAgc153s(String[] agc153s)
    {
        return gb12Mapper.deleteGb12ByAgc153s(agc153s);
    }

    /**
     * 删除教师信息信息
     * 
     * @param agc153 教师信息主键
     * @return 结果
     */
    @Override
    public int deleteGb12ByAgc153(String agc153)
    {
        return gb12Mapper.deleteGb12ByAgc153(agc153);
    }
}
