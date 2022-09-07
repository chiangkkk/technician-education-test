package com.zzhy.shopping.mapper;

import com.zzhy.shopping.domain.WxUserAwardRecord;
import com.zzhy.shopping.dto.AwardRecordDTO;

import java.util.List;

public interface WxUserAwardRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxUserAwardRecord record);

    int insertSelective(WxUserAwardRecord record);

    WxUserAwardRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxUserAwardRecord record);

    int updateByPrimaryKey(WxUserAwardRecord record);

    List<AwardRecordDTO> selectByAll(WxUserAwardRecord wxUserAwardRecord);


}