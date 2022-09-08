package com.zzhy.shopping.service;

import com.zzhy.shopping.domain.WxUserAwardRecord;
import com.zzhy.shopping.dto.AwardRecordDTO;

import java.util.List;

public interface WxUserAwardRecordService {


    int deleteByPrimaryKey(Long id);

    int insert(WxUserAwardRecord record);

    int insertSelective(WxUserAwardRecord record);

    WxUserAwardRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxUserAwardRecord record);

    int updateByPrimaryKey(WxUserAwardRecord record);

    List<AwardRecordDTO> getAwardList(WxUserAwardRecord record);

    int delete(Long id);
}

