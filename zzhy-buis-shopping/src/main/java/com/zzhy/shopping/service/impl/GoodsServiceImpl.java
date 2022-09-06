package com.zzhy.shopping.service.impl;

import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.dto.GoodsDTO;
import com.zzhy.shopping.mapper.WxGoodsMapper;
import com.zzhy.shopping.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/5 17:20
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private WxGoodsMapper wxGoodsMapper;

    @Override
    public List<GoodsDTO> getGoodsWithSku(WxGoods wxGoods) {
        return wxGoodsMapper.selectByGood(wxGoods);
    }
}
