package com.zzhy.shopping.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.shopping.mapper.TurntableDrawMapper;
import com.zzhy.shopping.domain.TurntableDraw;
import com.zzhy.shopping.service.ITurntableDrawService;

/**
 * 转盘抽奖Service业务层处理
 * 
 * @author zzhy
 * @date 2022-09-05
 */
@Service
public class TurntableDrawServiceImpl implements ITurntableDrawService 
{
    @Autowired
    private TurntableDrawMapper turntableDrawMapper;

    /**
     * 查询转盘抽奖
     * 
     * @param id 转盘抽奖主键
     * @return 转盘抽奖
     */
    @Override
    public TurntableDraw selectTurntableDrawById(Long id)
    {
        return turntableDrawMapper.selectTurntableDrawById(id);
    }

    /**
     * 查询转盘抽奖列表
     * 
     * @param turntableDraw 转盘抽奖
     * @return 转盘抽奖
     */
    @Override
    public List<TurntableDraw> selectTurntableDrawList(TurntableDraw turntableDraw)
    {
        return turntableDrawMapper.selectTurntableDrawList(turntableDraw);
    }

    /**
     * 新增转盘抽奖
     * 
     * @param turntableDraw 转盘抽奖
     * @return 结果
     */
    @Override
    public int insertTurntableDraw(TurntableDraw turntableDraw)
    {
        turntableDraw.setCreateTime(DateUtils.getNowDate());
        return turntableDrawMapper.insertTurntableDraw(turntableDraw);
    }

    /**
     * 修改转盘抽奖
     * 
     * @param turntableDraw 转盘抽奖
     * @return 结果
     */
    @Override
    public int updateTurntableDraw(TurntableDraw turntableDraw)
    {
        turntableDraw.setUpdateTime(DateUtils.getNowDate());
        return turntableDrawMapper.updateTurntableDraw(turntableDraw);
    }

    /**
     * 批量删除转盘抽奖
     * 
     * @param ids 需要删除的转盘抽奖主键
     * @return 结果
     */
    @Override
    public int deleteTurntableDrawByIds(Long[] ids)
    {
        return turntableDrawMapper.deleteTurntableDrawByIds(ids);
    }

    /**
     * 删除转盘抽奖信息
     * 
     * @param id 转盘抽奖主键
     * @return 结果
     */
    @Override
    public int deleteTurntableDrawById(Long id)
    {
        return turntableDrawMapper.deleteTurntableDrawById(id);
    }
}
