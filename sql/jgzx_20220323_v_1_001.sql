ALTER table sch_colleges_input add funding_application_type varchar(20) DEFAULT null COMMENT "资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费";

ALTER table sch_colleges_input add funding_application_type varchar(20) DEFAULT null COMMENT "资助申请类型  1=都申请,2=都不申请,3=只申请助学金,4=只申请免学费"

alter table  `sch_colleges_support_qualifications_apply` add learn_roll_solidify_id bigint DEFAULT NULL COMMENT '固化学籍id';

alter table  `sch_colleges_support_qualifications_apply` add support_tuition_apply_id bigint DEFAULT NULL COMMENT '助学金申请id';
