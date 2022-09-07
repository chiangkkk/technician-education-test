package com.zzhy.shopping.service.impl;

import com.zzhy.common.utils.DateUtils;
import com.zzhy.shopping.domain.TurntableDraw;
import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.domain.WxSku;
import com.zzhy.shopping.dto.DrawDTO;
import com.zzhy.shopping.mapper.TurntableDrawMapper;
import com.zzhy.shopping.mapper.WxGoodsMapper;
import com.zzhy.shopping.mapper.WxSkuMapper;
import com.zzhy.shopping.service.ITurntableDrawService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 转盘抽奖Service业务层处理
 *
 * @author zzhy
 * @date 2022-09-05
 */
@Service
@RequiredArgsConstructor
public class TurntableDrawServiceImpl implements ITurntableDrawService {

    private final TurntableDrawMapper turntableDrawMapper;

    private final WxSkuMapper wxSkuMapper;

    private final WxGoodsMapper wxGoodsMapper;

    /**
     * 查询转盘抽奖
     *
     * @param id 转盘抽奖主键
     * @return 转盘抽奖
     */
    @Override
    public TurntableDraw selectTurntableDrawById(Long id) {
        return turntableDrawMapper.selectTurntableDrawById(id);
    }

    /**
     * 查询转盘抽奖列表
     *
     * @param turntableDraw 转盘抽奖
     * @return 转盘抽奖
     */
    @Override
    public List<TurntableDraw> selectTurntableDrawList(TurntableDraw turntableDraw) {
        turntableDraw.setDelFlag(0);
        return turntableDrawMapper.selectTurntableDrawList(turntableDraw);
    }

    /**
     * 新增转盘抽奖
     *
     * @param turntableDraw 转盘抽奖
     * @return 结果
     */
    @Override
    public int insertTurntableDraw(TurntableDraw turntableDraw) {
        turntableDraw.setCreateTime(DateUtils.getNowDate());
        turntableDraw.setUpdateTime(new Date());
        return turntableDrawMapper.insertTurntableDraw(turntableDraw);
    }

    /**
     * 修改转盘抽奖
     *
     * @param turntableDraw 转盘抽奖
     * @return 结果
     */
    @Override
    public int updateTurntableDraw(TurntableDraw turntableDraw) {
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
    public int deleteTurntableDrawByIds(Long[] ids) {
        return turntableDrawMapper.deleteTurntableDrawByIds(ids);
    }

    @Override
    public List<TurntableDraw> getByTurnTableConfigId(Long tid) {
        return turntableDrawMapper.selectByTurntableConfigId(tid);
    }

    @Override
    public DrawDTO getInfo(Long id) {
        TurntableDraw turntableDraw = turntableDrawMapper.selectTurntableDrawById(id);
        DrawDTO drawDTO = convertToDrawDTO(turntableDraw);
        Long skuId = turntableDraw.getSkuId();
        if (skuId > 0) {
            WxSku wxSku = wxSkuMapper.selectByPrimaryKey(skuId);
            drawDTO.setWxSku(wxSku);
            if (null != wxSku) {
                Integer goodsId = wxSku.getGoodsId();
                WxGoods wxGoods = wxGoodsMapper.selectByPrimaryKey(goodsId.longValue());
                drawDTO.setWxGoods(wxGoods);
            }
        }
        if (skuId == 0L && turntableDraw.getGoodsId() != 0) {
            WxGoods wxGoods = wxGoodsMapper.selectByPrimaryKey(turntableDraw.getGoodsId());
            drawDTO.setWxGoods(wxGoods);
        }
        return drawDTO;
    }

    private DrawDTO convertToDrawDTO(TurntableDraw item) {
        if (item == null) {
            return null;
        }
        DrawDTO result = new DrawDTO();
        result.setWxGoods(null);
        result.setWxSku(null);
        result.setId(item.getId());
        result.setAwardName(item.getAwardName());
        result.setAwardType(item.getAwardType());
        result.setSkuId(item.getSkuId());
        result.setTurntableConfigId(item.getTurntableConfigId());
        result.setAwordSort(item.getAwordSort());
        result.setStatus(item.getStatus());
        result.setAwardRate(item.getAwardRate());
        result.setDelFlag(item.getDelFlag());
        result.setGoodsId(item.getGoodsId());
        result.setSearchValue(item.getSearchValue());
        result.setCreateBy(item.getCreateBy());
        result.setCreateTime(item.getCreateTime());
        result.setUpdateBy(item.getUpdateBy());
        result.setUpdateTime(item.getUpdateTime());
        result.setRemark(item.getRemark());
        result.setParams(item.getParams());
        return result;
    }

    @Override
    public int changeStatus(Long id) {
        TurntableDraw turntableDraw = turntableDrawMapper.selectTurntableDrawById(id);
        Integer status = turntableDraw.getStatus();
        if (status == 1) {
            turntableDraw.setStatus(2);
        } else {
            turntableDraw.setStatus(1);
        }
        return updateTurntableDraw(turntableDraw);
    }

    /**
     * 删除转盘抽奖信息
     *
     * @param id 转盘抽奖主键
     * @return 结果
     */
    @Override
    public int deleteTurntableDrawById(Long id) {
        return turntableDrawMapper.deleteTurntableDrawById(id);
    }
}
