package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxUserAwardRecord;

public interface WxUserAwardRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxUserAwardRecord record);

    int insertSelective(WxUserAwardRecord record);

    WxUserAwardRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxUserAwardRecord record);

    int updateByPrimaryKey(WxUserAwardRecord record);
}