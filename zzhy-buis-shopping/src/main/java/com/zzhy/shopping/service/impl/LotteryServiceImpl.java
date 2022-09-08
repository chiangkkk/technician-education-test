package com.zzhy.shopping.service.impl;

import com.zzhy.common.exception.ServiceException;
import com.zzhy.common.utils.DateUtils;
import com.zzhy.shopping.domain.NideshopUser;
import com.zzhy.shopping.domain.TurntableConfiguration;
import com.zzhy.shopping.domain.TurntableDraw;
import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.domain.WxSku;
import com.zzhy.shopping.domain.WxUserAwardRecord;
import com.zzhy.shopping.mapper.WxGoodsMapper;
import com.zzhy.shopping.mapper.WxSkuMapper;
import com.zzhy.shopping.mapper.WxUserAwardRecordMapper;
import com.zzhy.shopping.service.ITurntableConfigurationService;
import com.zzhy.shopping.service.ITurntableDrawService;
import com.zzhy.shopping.service.LotteryService;
import com.zzhy.shopping.service.NideshopUserService;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/7 15:09
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LotteryServiceImpl implements LotteryService {


    private final ITurntableDrawService turnTableDrawService;

    private final WxUserAwardRecordMapper awardRecordMapper;
    private final NideshopUserService nideshopUserService;

    private final WxGoodsMapper wxGoodsMapper;

    private final WxSkuMapper wxSkuMapper;

    private final ITurntableConfigurationService turntableConfigService;

    @Override
    public WxUserAwardRecord lottery(Long uid, Long turnTableId) {
        // 查询转盘配置
        TurntableConfiguration turntableConfiguration = turntableConfigService.selectTurntableConfigurationByTurntableId(turnTableId);
        if (null == turntableConfiguration) {
            throw new ServiceException("无此转盘");
        }
        if (turntableConfiguration.getLotteryNumber() <= 0) {
            throw new ServiceException("已无抽奖次数");
        }
        // 查询奖池
        List<TurntableDraw> byTurnTableConfigId = turnTableDrawService.getByTurnTableConfigId(turnTableId);
        if (byTurnTableConfigId.size() == 0) {
            throw new ServiceException("此转盘无奖池");
        }
        // 查询用户
        NideshopUser nideshopUser = nideshopUserService.selectByPrimaryKey(uid);
        if (null == nideshopUser) {
            throw new ServiceException("抽奖用户不存在");
        }
        // 获取抽中的奖项
        TurntableDraw award = doLottery(byTurnTableConfigId);
        // 奖项判空
        if (award == null) {
            // 防止抽奖出错 出错取谢谢参与
            award = byTurnTableConfigId.stream().filter(turntableDraw -> turntableDraw.getStatus() == 1
                    && turntableDraw.getAwardType() == 1).findFirst().orElse(null);
            if (award == null) {
                return null;
            }
        }
        WxUserAwardRecord record = new WxUserAwardRecord();
        record.setCreateTime(DateUtils.getNowDate());
        record.setUpdateTime(DateUtils.getNowDate());
        record.setCreator(nideshopUser.getUsername());
        record.setUpdateBy(nideshopUser.getUsername());
        record.setAwardName(award.getAwardName());
        record.setAwardId(award.getId());
        record.setAwardType(turnTableId);
        record.setIntegralVal(new BigDecimal(turntableConfiguration.getCusomerIntegral()));
        record.setUserId(nideshopUser.getId());
        record.setStatus(false);
        record.setRecStatus(false);
        // 谢谢参与 或 未中奖 场景
        if (1 == award.getAwardType()) {
            record.setStatus(true);
        } else {
            Long goodsId = award.getGoodsId();
            Long skuId = award.getSkuId();
            if (skuId == 0) {
                record.setGoodsId(goodsId);
                record.setSkuType(new Integer(0).byteValue());
                WxGoods wxGoods = wxGoodsMapper.selectByPrimaryKey(goodsId);
                record.setPic(wxGoods.getPrimaryPicUrl());
            } else {
                record.setSkuType(new Integer(1).byteValue());
                record.setGoodsId(skuId);
                WxSku wxSku = wxSkuMapper.selectByPrimaryKey(skuId);
                WxGoods wxGoods = wxGoodsMapper.selectByPrimaryKey(wxSku.getGoodsId().longValue());
                record.setPic(wxGoods.getPrimaryPicUrl());
            }
        }
        awardRecordMapper.insert(record);
        // 更新抽奖次数
        turntableConfiguration.setLotteryNumber(turntableConfiguration.getLotteryNumber() - 1);
        turntableConfigService.updateTurntableConfiguration(turntableConfiguration);
        return record;
    }

    /**
     * 通过抽奖列表返回抽中的奖项
     *
     * @param byTurnTableConfigId 奖项列表
     * @return 抽中的奖项
     */
    private TurntableDraw doLottery(List<TurntableDraw> byTurnTableConfigId) {
        long sum = byTurnTableConfigId.stream().mapToLong(TurntableDraw::getAwardRate).sum();
        long target = RandomUtils.nextLong(0, sum);
        long end = 0, start = 0;
        for (TurntableDraw turntableDraw : byTurnTableConfigId) {
            Long rate = turntableDraw.getAwardRate();
            start = end;
            end = start + rate;
            if (start <= rate && rate < end) {
                return turntableDraw;
            }
        }
        return null;
    }
}