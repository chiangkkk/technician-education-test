 -- 添加报名需要显示的信息字段
 alter table sch_colleges_admissions add	`preschool_graduate_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '学前信息，毕业学校名称';

 alter table sch_colleges_admissions add `preschool_degree_education` int DEFAULT NULL COMMENT '学前信息，入学前文化程度 1-初中，2-高中，3-技校，4-大专，5-大学，6-中级工（达到中级技能水平学生），7-中职毕业生，8-高级工（达到高级技能水平学生），9-相近工种工作满两年的在职员工，10-相近工种工作满一年的在职员工，11-现役军人，12-职高，13-中专，14-本科';