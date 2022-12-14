package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxSku record);

    int insertSelective(WxSku record);

    WxSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxSku record);

    int updateByPrimaryKey(WxSku record);

    List<WxSku> selectByGoodsId(@Param("goodsId") Integer goodsId);
}