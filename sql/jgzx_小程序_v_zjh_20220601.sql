alter table  sch_colleges_admissions_user add `attestation_flag` char(1) DEFAULT '2' COMMENT '实名认证标志，1-已实名，2-未实名';

alter table  sch_school add `admissions_paperwork` text  DEFAULT NULL COMMENT '报名须知文案';