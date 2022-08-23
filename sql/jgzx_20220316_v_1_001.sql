-- 录取表中新增不系统学籍信息id
alter table sch_colleges_input add  `learn_roll_part_id` bigint DEFAULT NULL COMMENT '部系统学籍信息id';