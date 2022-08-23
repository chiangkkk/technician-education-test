package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc58Mapper;
import com.zzhy.system.domain.Gc58;
import com.zzhy.system.service.IGc58Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc58ServiceImpl implements IGc58Service 
{
    @Autowired
    private Gc58Mapper gc58Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param age732 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Gc58 selectGc58ByAge732(String age732)
    {
        return gc58Mapper.selectGc58ByAge732(age732);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param gc58 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Gc58> selectGc58List(Gc58 gc58)
    {
        return gc58Mapper.selectGc58List(gc58);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param gc58 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertGc58(Gc58 gc58)
    {
        return gc58Mapper.insertGc58(gc58);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param gc58 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateGc58(Gc58 gc58)
    {
        return gc58Mapper.updateGc58(gc58);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param age732s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteGc58ByAge732s(String[] age732s)
    {
        return gc58Mapper.deleteGc58ByAge732s(age732s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param age732 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteGc58ByAge732(String age732)
    {
        return gc58Mapper.deleteGc58ByAge732(age732);
    }
}
