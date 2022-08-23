CREATE TABLE `sch_colleges_admissions_relation`
(
  `admissions_relation_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`colleges_user_id` bigint DEFAULT NULL COMMENT '小程序用户id',
	`colleges_major_id` bigint COMMENT '所属院校专业id',
	`timelimit_id` bigint COMMENT '轮次招生ID',
	
	 `admissions_user_id` bigint COMMENT '招生报名用户ID',
 `status` char(1) DEFAULT '1' COMMENT '状态（1正常 2停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1) DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
	PRIMARY KEY (`admissions_relation_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='招生报名轮次专业用户关联关系表';

