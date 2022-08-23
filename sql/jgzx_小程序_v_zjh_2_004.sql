-- 新增招生报名用户管理表
CREATE TABLE `sch_colleges_admissions_user` (
  `admissions_user_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `colleges_user_id` bigint DEFAULT NULL COMMENT '小程序用户id',
  `student_name` varchar(50)  DEFAULT NULL COMMENT '姓名',
  `certificate_type` varchar(100)  DEFAULT NULL COMMENT '证件类型 001-居民身份证（户口溥），002-香港特区护照/港澳居民来往内地通行证，003-澳门特区护照/港澳居民来往内地通行证，004-台湾居民来往大陆通信证，005-外国人护照，006-社会保障卡，007-军官证，008-香港居民身份证，009-澳门居民身份证，010-台湾居民身份证，999-其他证件',
  `certificate_num` varchar(100)  DEFAULT NULL COMMENT '证件号码（加密）',
  `sex` varchar(2)  DEFAULT NULL COMMENT '性别，1女，2男',
  `clan` varchar(20)  DEFAULT NULL COMMENT '民族为下拉框，可选择56个民族。另外加几个民族外籍人士、其他族、外国血统、外国民族',
  `birthday` varchar(30)  DEFAULT NULL COMMENT '出生日期',
  `student_telephone` varchar(200)  DEFAULT NULL COMMENT '联系电话',
  `family_address` varchar(200)  DEFAULT NULL COMMENT '家庭住址',
  `political_outlook` varchar(20)  DEFAULT NULL COMMENT '政治面貌 1-群众，2-中国共产党员，3-中国共产主义共青团团员',
  `admissions_type` tinyint DEFAULT NULL COMMENT '招生类型，1是中招，2是自主招生',
  `recommender` varchar(20) DEFAULT NULL COMMENT '推荐人',
  `examination_achievement` varchar(20) DEFAULT NULL COMMENT '考试成绩',
  `preschool_graduate_name` varchar(255)  DEFAULT NULL COMMENT '学前信息，毕业学校名称',
  `preschool_degree_education` int DEFAULT NULL COMMENT '学前信息，入学前文化程度 1-初中，2-高中，3-技校，4-大专，5-大学，6-中级工（达到中级技能水平学生），7-中职毕业生，8-高级工（达到高级技能水平学生），9-相近工种工作满两年的在职员工，10-相近工种工作满一年的在职员工，11-现役军人，12-职高，13-中专，14-本科',
  `status` char(1)  DEFAULT '1' COMMENT '状态（1正常 2停用）',
  `create_by` varchar(64)  DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64)  DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1)  DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`admissions_user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='招生报名用户管理表';

-- 新增相关字段
alter table sch_colleges_admissions add `admissions_user_id` bigint DEFAULT NULL COMMENT '招生报名用户id';
alter table sch_colleges_admissions add `attestation_flag` char(1) DEFAULT '2' COMMENT '实名认证标志，1-已实名，2-未实名';

-- 添加录取和确认就读时间
alter TABLE sch_colleges_input add   `input_time` datetime DEFAULT NULL COMMENT '录取时间';
alter TABLE sch_colleges_input add   `confirm_time` datetime DEFAULT NULL COMMENT '确认就读时间';

-- 院校表添加排序字段
alter table sch_school add `sort` int DEFAULT '0' COMMENT '排序';