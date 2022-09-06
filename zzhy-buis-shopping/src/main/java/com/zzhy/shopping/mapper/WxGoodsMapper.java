package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.dto.GoodsDTO;
import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface WxGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxGoods record);

    int insertSelective(WxGoods record);

    WxGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxGoods record);

    int updateByPrimaryKey(WxGoods record);

    /**
     *
     * @param wxGoods
     * @return
     */
    List<WxGoods> selectByAll(WxGoods wxGoods);

    List<GoodsDTO> selectByGood(WxGoods wxGoods);

}