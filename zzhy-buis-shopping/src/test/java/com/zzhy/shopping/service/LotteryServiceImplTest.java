package com.zzhy.shopping.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;

@Slf4j
class LotteryServiceImplTest {

    /**
     * RanaomUtils.nextInt(0,1) => [0,1)
     * 左必右开
     *
     */
    @Test
    public void testRandom(){
        for (int i = 0; i < 100 ; i++) {
            int rand = RandomUtils.nextInt(0, 1);
            log.info("random = {}",rand);
        }
    }

}