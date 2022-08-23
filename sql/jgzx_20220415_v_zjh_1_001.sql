-- 相关表新增资助类型
alter table sch_colleges_learn_roll add  `funding_application_type` varchar(20) DEFAULT NULL COMMENT '资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费';
alter table sch_colleges_learn_roll_record add  `funding_application_type` varchar(20) DEFAULT NULL COMMENT '资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费';
alter table sch_colleges_learn_roll_roster add  `funding_application_type` varchar(20) DEFAULT NULL COMMENT '资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费';
alter table sch_colleges_learn_roll_solidify_roster add  `funding_application_type` varchar(20) DEFAULT NULL COMMENT '资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费';
alter table sch_colleges_student_info add  `funding_application_type` varchar(20) DEFAULT NULL COMMENT '资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费';