package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Ga07Mapper;
import com.zzhy.system.domain.Ga07;
import com.zzhy.system.service.IGa07Service;

/**
 * 助学金标准Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Ga07ServiceImpl implements IGa07Service 
{
    @Autowired
    private Ga07Mapper ga07Mapper;

    /**
     * 查询助学金标准
     * 
     * @param age661 助学金标准主键
     * @return 助学金标准
     */
    @Override
    public Ga07 selectGa07ByAge661(String age661)
    {
        return ga07Mapper.selectGa07ByAge661(age661);
    }

    /**
     * 查询助学金标准列表
     * 
     * @param ga07 助学金标准
     * @return 助学金标准
     */
    @Override
    public List<Ga07> selectGa07List(Ga07 ga07)
    {
        return ga07Mapper.selectGa07List(ga07);
    }

    /**
     * 新增助学金标准
     * 
     * @param ga07 助学金标准
     * @return 结果
     */
    @Override
    public int insertGa07(Ga07 ga07)
    {
        return ga07Mapper.insertGa07(ga07);
    }

    /**
     * 修改助学金标准
     * 
     * @param ga07 助学金标准
     * @return 结果
     */
    @Override
    public int updateGa07(Ga07 ga07)
    {
        return ga07Mapper.updateGa07(ga07);
    }

    /**
     * 批量删除助学金标准
     * 
     * @param age661s 需要删除的助学金标准主键
     * @return 结果
     */
    @Override
    public int deleteGa07ByAge661s(String[] age661s)
    {
        return ga07Mapper.deleteGa07ByAge661s(age661s);
    }

    /**
     * 删除助学金标准信息
     * 
     * @param age661 助学金标准主键
     * @return 结果
     */
    @Override
    public int deleteGa07ByAge661(String age661)
    {
        return ga07Mapper.deleteGa07ByAge661(age661);
    }
}
