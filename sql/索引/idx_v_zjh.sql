alter table sch_colleges_learn_roll_part add  KEY `IDX_PART_school_id` (`school_id`);
alter table sch_colleges_learn_roll_part add   KEY `IDX_PART_del_flag` (`del_flag`);

alter table sch_colleges_learn_roll add KEY `IDX_CLR_student_info_id` (`school_id`,`student_info_id`,`del_flag`,`status`) USING BTREE;
alter table sch_colleges_learn_roll add KEY `IDX_CLR_ del_flag` (`del_flag`);
alter table sch_colleges_learn_roll add KEY `IDX_CLR_status` (`status`);
