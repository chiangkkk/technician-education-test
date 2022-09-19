package com.zzhy.shopping.task;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author ChiangKai
 * @date 2022/9/16 15:05
 */
@Component
@Slf4j
public class TestTaskService {

    /**
     * 1. fixedDelay：在上一次定时任务执行完之后，间隔多久继续执行。
     * 2. fixedRate：无论上一次定时任务有没有执行完成，两次任务之间的时间间隔。
     * 3. cron：使用cron表达式来指定任务计划。
     */
    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.SECONDS)
    public void test() {
        log.info("time = {}", DateUtil.now());
    }

}
