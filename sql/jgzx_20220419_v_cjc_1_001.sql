ALTER TABLE sch_colleges_admissions ADD COLUMN  recommender varchar(20) DEFAULT NULL COMMENT '推荐人';
ALTER TABLE sch_colleges_input ADD COLUMN  recommender varchar(20) DEFAULT NULL COMMENT '推荐人';