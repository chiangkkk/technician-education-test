package com.zzhy.quartz.task;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component("AuditTake")
public class AuditTake {


    public void AuditSucccess()
    {
        System.out.println(new Date()+"执行了月度自动审批通过定时器任务-----------------------------");
//        collegesSupportTuitionApplyService.autoAuditApply();

    }
}
