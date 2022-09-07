package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.TurntableDraw;

import java.util.List;

/**
 * 转盘抽奖Mapper接口
 * 
 * @author zzhy
 * @date 2022-09-05
 */
public interface TurntableDrawMapper 
{
    /**
     * 查询转盘抽奖
     * 
     * @param id 转盘抽奖主键
     * @return 转盘抽奖
     */
    public TurntableDraw selectTurntableDrawById(Long id);

    /**
     * 查询转盘抽奖列表
     * 
     * @param turntableDraw 转盘抽奖
     * @return 转盘抽奖集合
     */
    public List<TurntableDraw> selectTurntableDrawList(TurntableDraw turntableDraw);

    /**
     * 新增转盘抽奖
     * 
     * @param turntableDraw 转盘抽奖
     * @return 结果
     */
    public int insertTurntableDraw(TurntableDraw turntableDraw);

    /**
     * 修改转盘抽奖
     * 
     * @param turntableDraw 转盘抽奖
     * @return 结果
     */
    public int updateTurntableDraw(TurntableDraw turntableDraw);

    /**
     * 删除转盘抽奖
     * 
     * @param id 转盘抽奖主键
     * @return 结果
     */
    public int deleteTurntableDrawById(Long id);

    /**
     * 批量删除转盘抽奖
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTurntableDrawByIds(Long[] ids);

    List<TurntableDraw> selectByTurntableConfigId(Long tcid);


}
