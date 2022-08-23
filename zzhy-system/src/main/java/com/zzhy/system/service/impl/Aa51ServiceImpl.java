package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Aa51Mapper;
import com.zzhy.system.domain.Aa51;
import com.zzhy.system.service.IAa51Service;

/**
 * 行政区划Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Aa51ServiceImpl implements IAa51Service 
{
    @Autowired
    private Aa51Mapper aa51Mapper;

    /**
     * 查询行政区划
     * 
     * @param aaa145 行政区划主键
     * @return 行政区划
     */
    @Override
    public Aa51 selectAa51ByAaa145(String aaa145)
    {
        return aa51Mapper.selectAa51ByAaa145(aaa145);
    }

    /**
     * 查询行政区划列表
     * 
     * @param aa51 行政区划
     * @return 行政区划
     */
    @Override
    public List<Aa51> selectAa51List(Aa51 aa51)
    {
        return aa51Mapper.selectAa51List(aa51);
    }

    /**
     * 新增行政区划
     * 
     * @param aa51 行政区划
     * @return 结果
     */
    @Override
    public int insertAa51(Aa51 aa51)
    {
        return aa51Mapper.insertAa51(aa51);
    }

    /**
     * 修改行政区划
     * 
     * @param aa51 行政区划
     * @return 结果
     */
    @Override
    public int updateAa51(Aa51 aa51)
    {
        return aa51Mapper.updateAa51(aa51);
    }

    /**
     * 批量删除行政区划
     * 
     * @param aaa145s 需要删除的行政区划主键
     * @return 结果
     */
    @Override
    public int deleteAa51ByAaa145s(String[] aaa145s)
    {
        return aa51Mapper.deleteAa51ByAaa145s(aaa145s);
    }

    /**
     * 删除行政区划信息
     * 
     * @param aaa145 行政区划主键
     * @return 结果
     */
    @Override
    public int deleteAa51ByAaa145(String aaa145)
    {
        return aa51Mapper.deleteAa51ByAaa145(aaa145);
    }
}
