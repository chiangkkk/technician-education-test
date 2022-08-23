package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc53Mapper;
import com.zzhy.system.domain.Gc53;
import com.zzhy.system.service.IGc53Service;

/**
 * 助学金信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc53ServiceImpl implements IGc53Service 
{
    @Autowired
    private Gc53Mapper gc53Mapper;

    /**
     * 查询助学金信息
     * 
     * @param age535 助学金信息主键
     * @return 助学金信息
     */
    @Override
    public Gc53 selectGc53ByAge535(String age535)
    {
        return gc53Mapper.selectGc53ByAge535(age535);
    }

    /**
     * 查询助学金信息列表
     * 
     * @param gc53 助学金信息
     * @return 助学金信息
     */
    @Override
    public List<Gc53> selectGc53List(Gc53 gc53)
    {
        return gc53Mapper.selectGc53List(gc53);
    }

    /**
     * 新增助学金信息
     * 
     * @param gc53 助学金信息
     * @return 结果
     */
    @Override
    public int insertGc53(Gc53 gc53)
    {
        return gc53Mapper.insertGc53(gc53);
    }

    /**
     * 修改助学金信息
     * 
     * @param gc53 助学金信息
     * @return 结果
     */
    @Override
    public int updateGc53(Gc53 gc53)
    {
        return gc53Mapper.updateGc53(gc53);
    }

    /**
     * 批量删除助学金信息
     * 
     * @param age535s 需要删除的助学金信息主键
     * @return 结果
     */
    @Override
    public int deleteGc53ByAge535s(String[] age535s)
    {
        return gc53Mapper.deleteGc53ByAge535s(age535s);
    }

    /**
     * 删除助学金信息信息
     * 
     * @param age535 助学金信息主键
     * @return 结果
     */
    @Override
    public int deleteGc53ByAge535(String age535)
    {
        return gc53Mapper.deleteGc53ByAge535(age535);
    }
}
