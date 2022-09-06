package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxSkuSpecAttr;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxSkuSpecAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxSkuSpecAttr record);

    int insertSelective(WxSkuSpecAttr record);

    WxSkuSpecAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxSkuSpecAttr record);

    int updateByPrimaryKey(WxSkuSpecAttr record);

    List<WxSkuSpecAttr> selectBySpecIdAndGoodsId(@Param("specId") Long specId, @Param("goodsId") Long goodsId);
}