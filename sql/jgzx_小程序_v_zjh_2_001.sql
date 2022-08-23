-- 二期小程序表结构创建

-- 用户小程序报名信息表
CREATE TABLE `sch_colleges_user` (
  `colleges_user_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `mobile` varchar(20) DEFAULT '' COMMENT '手机号',
  `username` varchar(60) DEFAULT '' COMMENT '姓名',
  `password` varchar(100) DEFAULT '' COMMENT '密码',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别，1男，2女',
  `channel_type` char(1) DEFAULT NULL COMMENT '会员渠道类型，1-微信小程序，2-PC官网',
  `attestation_flag` char(1) DEFAULT '2' COMMENT '实名认证标志，1-已实名，2-未实名',
  `birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `register_time` datetime DEFAULT NULL COMMENT '注册日期',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` varchar(15) DEFAULT '' COMMENT '最后登录IP',
  `nickname` varchar(60) CHARACTER SET utf8mb4 DEFAULT '' COMMENT '昵称',
  `head_url` varchar(255) DEFAULT '' COMMENT '头像',
  `openid` varchar(50) DEFAULT '' COMMENT '微信授权获取的openid',
  `contact_address` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `referrer_id` bigint(20) DEFAULT NULL COMMENT '推荐人id（预留字段以后用）',
  `referrer_name` varchar(50) DEFAULT NULL COMMENT '推荐人姓名（预留字段）',
  `session_key` varchar(100) DEFAULT NULL COMMENT 'sessionKey用于手机号解密',
  `unionid` varchar(50) DEFAULT NULL COMMENT 'unionid',
  `status` char(1)  DEFAULT '1' COMMENT '状态（1正常 2停用）',
  `create_by` varchar(64)  DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64)  DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1)  DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`colleges_user_id`) USING BTREE,
  KEY `user_name` (`username`) USING BTREE,
  KEY `mobile` (`mobile`) USING BTREE,
  KEY `openid` (`openid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8   COMMENT='用户小程序报信息表';



-- sch_colleges_admissions表 添加用户id
alter table sch_colleges_admissions add colleges_user_id bigint(20) DEFAULT NULL COMMENT '小程序用户id';

-- sch_colleges_student_info 表
alter table sch_colleges_student_info add colleges_user_id bigint(20) DEFAULT NULL COMMENT '小程序用户id';

-- sch_colleges_input 表
alter table sch_colleges_input add colleges_user_id bigint(20) DEFAULT NULL COMMENT '小程序用户id';

-- sch_colleges_admissions 表
alter table sch_colleges_admissions add timelimit_id bigint(20) DEFAULT NULL COMMENT '招生报名配置id';
-- sch_colleges_input 表
alter table sch_colleges_input add timelimit_id bigint(20) DEFAULT NULL COMMENT '招生报名配置id';

-- 轮播图管理

CREATE TABLE `sup_declare_banner` (
  `banner_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `title` varchar(500) DEFAULT NULL COMMENT '标题',
  `position_type` char(1) DEFAULT NULL COMMENT '轮播图位置（1微信小程序-首页轮播图，2-pc官网-首页轮播图）',
  `start_time` datetime  DEFAULT NULL COMMENT '对外发布开始时间',
  `end_time` datetime  DEFAULT NULL COMMENT '对外发布结束时间（为空表示一直有效,前提开始时间不为空）',
  `jump_url` varchar(30)  DEFAULT NULL COMMENT '轮播图片跳转地址',
  `img_url` varchar(200)  DEFAULT NULL COMMENT '图片地址',
  `banner_state` char(1) DEFAULT '3' COMMENT '轮播图状态 1待审核，2审核中，3审核通过，4审核驳回，',
  `sort` int DEFAULT '0' COMMENT '轮播图排序 数值越大越靠前显示',
  `status` char(1)  DEFAULT '1' COMMENT '状态（1正常 2停用）',
  `create_by` varchar(64)  DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64)  DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1)  DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`banner_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4  COMMENT='轮播图管理表';



-- 文章管理


CREATE TABLE `sup_declare_article` (
  `article_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `article_title` varchar(500) DEFAULT NULL COMMENT '文章名称',
  `article_type` char(1) DEFAULT NULL COMMENT '文章类型（1-通知公告，2-政策法规）',
  `article_top` char(1) DEFAULT '2' COMMENT '是否置顶（1-是，2-否）',
  `terminal_type` char(1) DEFAULT '2' COMMENT '发布终端（1-微信小程序，2-pc官网）',
  `start_time` datetime  DEFAULT NULL COMMENT '对外发布开始时间',
  `end_time` datetime  DEFAULT NULL COMMENT '对外发布结束时间（为空表示一直有效,前提开始时间不为空）',
  `article_url` varchar(255)  DEFAULT NULL COMMENT '文章链接地址（文章链接地址由系统自动生成，并非客户填写，此处展示是为了给轮播图管理中添加轮播图跳转链接使用）',
  `article_details` text  DEFAULT NULL COMMENT '文章详情',
  `article_state` char(1) DEFAULT '3' COMMENT '文章状态 1待审核，2审核中，3审核通过，4审核驳回，',
  `sort` int DEFAULT '0' COMMENT '文章排序 数值越大越靠前显示',
  `status` char(1)  DEFAULT '1' COMMENT '状态（1正常 2停用）',
  `create_by` varchar(64)  DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64)  DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1)  DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`banner_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4  COMMENT='文章管理表';


-- 按轮次招生时限配置表

CREATE TABLE `sup_declare_timelimit` (
  `timelimit_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `timelimit_name` varchar(500) DEFAULT NULL COMMENT '招生报名时限名称',
  `timelimit_type` char(1) DEFAULT NULL COMMENT '时限类型 (1-正常招生，2-补录招生)',
  `foster_type` char(1) DEFAULT '1' COMMENT '招生报名对应学习形式（1-全日制，2-非全日制，3-（全日制，非全日制））',
  `enroll_quota` int(8) DEFAULT null COMMENT '报名数量限制',
  `year_time` varchar(10)  DEFAULT NULL COMMENT '招生报名年度',
  `season` char(1)  DEFAULT NULL COMMENT '招生报名季度，1是春季，2是秋季',
  `year_season` varchar(50)  DEFAULT NULL COMMENT '招生报名对应年度季度 如2022年春季',
  `enroll_start_time` datetime  DEFAULT NULL COMMENT '招生报名开始时间',
  `enroll_end_time` datetime  DEFAULT NULL COMMENT '招生报名结束时间',
  `admission_start_time` datetime  DEFAULT NULL COMMENT '院校录取确认开始时间',
  `admission_end_time` datetime  DEFAULT NULL COMMENT '院校录取确认结束时间',
  `attend_start_time` datetime  DEFAULT NULL COMMENT '确认就读开始时间',
  `attend_end_time` datetime  DEFAULT NULL COMMENT '确认就读结束时间',
  `round_count` int DEFAULT null COMMENT '轮次数,暂时不考虑，后续需要在考虑进去',
  `sort` int DEFAULT '0' COMMENT '文章排序 数值越大越靠前显示',
  `status` char(1)  DEFAULT '1' COMMENT '状态（1正常 2停用）',
  `create_by` varchar(64)  DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64)  DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1)  DEFAULT '1' COMMENT '删除标志（1代表存在 2代表删除）',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`timelimit_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4  COMMENT='按轮次招生时限配置表';

