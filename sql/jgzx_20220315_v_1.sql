	
ALTER table sch_colleges_basic_reporting add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";


ALTER table sch_colleges_recruit_students_brochure add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";


ALTER table sch_colleges_support_qualifications_apply add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";

ALTER table sch_colleges_support_reissue_apply add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";

ALTER table sch_colleges_support_tuition_apply add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";


ALTER table sch_colleges_recruit_students_major add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";

ALTER table sch_colleges_tuition_standard add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";

ALTER table sch_colleges_learn_roll_apply add declare_status tinyint(1) DEFAULT null COMMENT "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）";

alter table sch_colleges_learn_roll_record MODIFY `enrollment_target` text DEFAULT NULL COMMENT '招生对象，1-初中毕业，2-高中毕业，3-达到中级技能水平学生，4-达到高级技能水平学生';

alter table sch_colleges_learn_roll MODIFY `enrollment_target` text DEFAULT NULL COMMENT '招生对象，1-初中毕业，2-高中毕业，3-达到中级技能水平学生，4-达到高级技能水平学生';

alter table sch_colleges_learn_roll_solidify_roster MODIFY `enrollment_target` text DEFAULT NULL COMMENT '招生对象，1-初中毕业，2-高中毕业，3-达到中级技能水平学生，4-达到高级技能水平学生';