package com.zzhy.shopping.service.impl;

import com.zzhy.shopping.domain.WxUserAwardRecord;
import com.zzhy.shopping.dto.AwardRecordDTO;
import com.zzhy.shopping.mapper.WxUserAwardRecordMapper;
import com.zzhy.shopping.service.WxUserAwardRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WxUserAwardRecordServiceImpl implements WxUserAwardRecordService {

    @Resource
    private WxUserAwardRecordMapper wxUserAwardRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wxUserAwardRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WxUserAwardRecord record) {
        return wxUserAwardRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(WxUserAwardRecord record) {
        return wxUserAwardRecordMapper.insertSelective(record);
    }

    @Override
    public WxUserAwardRecord selectByPrimaryKey(Long id) {
        return wxUserAwardRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WxUserAwardRecord record) {
        return wxUserAwardRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WxUserAwardRecord record) {
        return wxUserAwardRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AwardRecordDTO> getAwardList(WxUserAwardRecord record) {
        return wxUserAwardRecordMapper.selectByAll(record);
    }
}

