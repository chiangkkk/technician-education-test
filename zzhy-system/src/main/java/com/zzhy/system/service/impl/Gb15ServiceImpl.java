package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gb15Mapper;
import com.zzhy.system.domain.Gb15;
import com.zzhy.system.service.IGb15Service;

/**
 * 院校专业修改信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-22
 */
@Service
public class Gb15ServiceImpl implements IGb15Service 
{
    @Autowired
    private Gb15Mapper gb15Mapper;

    /**
     * 查询院校专业修改信息
     * 
     * @param age879 院校专业修改信息主键
     * @return 院校专业修改信息
     */
    @Override
    public Gb15 selectGb15ByAge879(String age879)
    {
        return gb15Mapper.selectGb15ByAge879(age879);
    }

    /**
     * 查询院校专业修改信息列表
     * 
     * @param gb15 院校专业修改信息
     * @return 院校专业修改信息
     */
    @Override
    public List<Gb15> selectGb15List(Gb15 gb15)
    {
        return gb15Mapper.selectGb15List(gb15);
    }

    /**
     * 新增院校专业修改信息
     * 
     * @param gb15 院校专业修改信息
     * @return 结果
     */
    @Override
    public int insertGb15(Gb15 gb15)
    {
        return gb15Mapper.insertGb15(gb15);
    }

    /**
     * 修改院校专业修改信息
     * 
     * @param gb15 院校专业修改信息
     * @return 结果
     */
    @Override
    public int updateGb15(Gb15 gb15)
    {
        return gb15Mapper.updateGb15(gb15);
    }

    /**
     * 批量删除院校专业修改信息
     * 
     * @param age879s 需要删除的院校专业修改信息主键
     * @return 结果
     */
    @Override
    public int deleteGb15ByAge879s(String[] age879s)
    {
        return gb15Mapper.deleteGb15ByAge879s(age879s);
    }

    /**
     * 删除院校专业修改信息信息
     * 
     * @param age879 院校专业修改信息主键
     * @return 结果
     */
    @Override
    public int deleteGb15ByAge879(String age879)
    {
        return gb15Mapper.deleteGb15ByAge879(age879);
    }
}
