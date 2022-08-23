ALTER table  sch_colleges_learn_roll_solidify_roster add use_status  TINYINT(1) DEFAULT null COMMENT '区别伪删除 标识伪删除但是被其他业务使用 1-在使用';
