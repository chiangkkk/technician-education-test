package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gb13Mapper;
import com.zzhy.system.domain.Gb13;
import com.zzhy.system.service.IGb13Service;

/**
 * 院校专业信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gb13ServiceImpl implements IGb13Service 
{
    @Autowired
    private Gb13Mapper gb13Mapper;

    /**
     * 查询院校专业信息
     * 
     * @param age655 院校专业信息主键
     * @return 院校专业信息
     */
    @Override
    public Gb13 selectGb13ByAge655(String age655)
    {
        return gb13Mapper.selectGb13ByAge655(age655);
    }

    /**
     * 查询院校专业信息列表
     * 
     * @param gb13 院校专业信息
     * @return 院校专业信息
     */
    @Override
    public List<Gb13> selectGb13List(Gb13 gb13)
    {
        return gb13Mapper.selectGb13List(gb13);
    }

    /**
     * 新增院校专业信息
     * 
     * @param gb13 院校专业信息
     * @return 结果
     */
    @Override
    public int insertGb13(Gb13 gb13)
    {
        return gb13Mapper.insertGb13(gb13);
    }

    /**
     * 修改院校专业信息
     * 
     * @param gb13 院校专业信息
     * @return 结果
     */
    @Override
    public int updateGb13(Gb13 gb13)
    {
        return gb13Mapper.updateGb13(gb13);
    }

    /**
     * 批量删除院校专业信息
     * 
     * @param age655s 需要删除的院校专业信息主键
     * @return 结果
     */
    @Override
    public int deleteGb13ByAge655s(String[] age655s)
    {
        return gb13Mapper.deleteGb13ByAge655s(age655s);
    }

    /**
     * 删除院校专业信息信息
     * 
     * @param age655 院校专业信息主键
     * @return 结果
     */
    @Override
    public int deleteGb13ByAge655(String age655)
    {
        return gb13Mapper.deleteGb13ByAge655(age655);
    }
}
