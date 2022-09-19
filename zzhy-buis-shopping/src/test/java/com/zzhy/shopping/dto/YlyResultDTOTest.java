package com.zzhy.shopping.dto;

import com.alibaba.fastjson.JSON;
import com.zzhy.common.utils.uuid.UUID;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class YlyResultDTOTest {

    @Test
    public void testYly(){
        String str = "{\"error\":\"0\",\"error_description\":\"success\",\"body\":{\"id\":\"订单号\",\"origin_id\":\"\"}}";
        YlyResultDTO ylyResultDTO = JSON.parseObject(str, YlyResultDTO.class);

        log.info("ylyResultDTO={},oid={}",ylyResultDTO, UUID.fastUUID().toString().replace("-",""));
    }

}