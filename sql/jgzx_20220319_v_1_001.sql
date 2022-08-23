ALTER table sch_colleges_learn_roll_roster add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";

ALTER table sch_colleges_pre_graduation add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";


