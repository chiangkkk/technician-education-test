package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Ge11Mapper;
import com.zzhy.system.domain.Ge11;
import com.zzhy.system.service.IGe11Service;

/**
 * 中职卡导入记录Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Ge11ServiceImpl implements IGe11Service 
{
    @Autowired
    private Ge11Mapper ge11Mapper;

    /**
     * 查询中职卡导入记录
     * 
     * @param age514 中职卡导入记录主键
     * @return 中职卡导入记录
     */
    @Override
    public Ge11 selectGe11ByAge514(String age514)
    {
        return ge11Mapper.selectGe11ByAge514(age514);
    }

    /**
     * 查询中职卡导入记录列表
     * 
     * @param ge11 中职卡导入记录
     * @return 中职卡导入记录
     */
    @Override
    public List<Ge11> selectGe11List(Ge11 ge11)
    {
        return ge11Mapper.selectGe11List(ge11);
    }

    /**
     * 新增中职卡导入记录
     * 
     * @param ge11 中职卡导入记录
     * @return 结果
     */
    @Override
    public int insertGe11(Ge11 ge11)
    {
        return ge11Mapper.insertGe11(ge11);
    }

    /**
     * 修改中职卡导入记录
     * 
     * @param ge11 中职卡导入记录
     * @return 结果
     */
    @Override
    public int updateGe11(Ge11 ge11)
    {
        return ge11Mapper.updateGe11(ge11);
    }

    /**
     * 批量删除中职卡导入记录
     * 
     * @param age514s 需要删除的中职卡导入记录主键
     * @return 结果
     */
    @Override
    public int deleteGe11ByAge514s(String[] age514s)
    {
        return ge11Mapper.deleteGe11ByAge514s(age514s);
    }

    /**
     * 删除中职卡导入记录信息
     * 
     * @param age514 中职卡导入记录主键
     * @return 结果
     */
    @Override
    public int deleteGe11ByAge514(String age514)
    {
        return ge11Mapper.deleteGe11ByAge514(age514);
    }
}
