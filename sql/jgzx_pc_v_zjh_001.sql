我的收藏表
CREATE TABLE `sch_colleges_collection` (
  `collection_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `colleges_user_id` bigint DEFAULT NULL COMMENT '小程序用户id',
  `timelimit_id` bigint DEFAULT NULL COMMENT '招生报名配置id',
  `school_id` bigint DEFAULT NULL COMMENT '所属院校',
  `colleges_major_id` bigint DEFAULT NULL COMMENT '所属院校专业id',
  `brochure_id` bigint DEFAULT NULL COMMENT '招生计划id，对应多个学校申报专业',
  `recruit_students_major_id` bigint DEFAULT NULL COMMENT '今年已经申报通过的招生专业id',
  `certificate_num` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '证件号码（加密）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1) DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`collection_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='我的收藏表';




意见反馈表
CREATE TABLE `sch_colleges_feedback` (
	`feedback_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`colleges_user_id` bigint DEFAULT NULL COMMENT '小程序用户id',
    `mobile` varchar(200)  DEFAULT NULL COMMENT '联系方式',
    `opinion` text  DEFAULT NULL COMMENT '反馈意见',
	`create_by` varchar(64) DEFAULT '' COMMENT '创建者',
	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	`update_by` varchar(64) DEFAULT '' COMMENT '更新者',
	`update_time` datetime DEFAULT NULL COMMENT '更新时间',
	`del_flag` char(1) DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
	`remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`feedback_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='意见反馈表';


//院校公告表
CREATE TABLE `sch_colleges_article` (
  `colleges_article_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `article_title` varchar(500) DEFAULT NULL COMMENT '文章名称',
  `article_type` char(1) DEFAULT '1' COMMENT '文章类型（1-通知公告，2-政策法规）',
  `school_id` bigint DEFAULT NULL COMMENT '所属院校',
  `article_top` char(1) DEFAULT '2' COMMENT '是否置顶（1-是，2-否）',
  `terminal_type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '2' COMMENT '发布终端（1-微信小程序，2-pc官网, 3(小程序+PC)）',
  `start_time` datetime DEFAULT NULL COMMENT '对外发布开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '对外发布结束时间（为空表示一直有效,前提开始时间不为空）',
  `article_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '文章链接地址（文章链接地址由系统自动生成，并非客户填写，此处展示是为了给轮播图管理中添加轮播图跳转链接使用）\r\n',
  `article_details` text COMMENT '文章详情',
  `article_state` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '3' COMMENT '文章状态1待审核，2审核中，3审核通过，4审核驳回，',
  `pageviews` int DEFAULT NULL COMMENT '浏览量',
  `sort` int DEFAULT '0' COMMENT '文章排序 数值越大越靠前显示',
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '状态（ 0草稿  1正常 2停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1) DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`colleges_article_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='院校公告管理表';



热门配置专业表
CREATE TABLE `sup_declare_hot_institution` (
  `hot_institution_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `institution_id` bigint DEFAULT NULL COMMENT '专业id',
  `major_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '专业名称',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '图片地址',
  `sort` int DEFAULT '0' COMMENT '文章排序 数值越大越靠前显示',
  `status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '状态（ 0草稿  1正常 2停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1) DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`hot_institution_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='热门配置专业表';


