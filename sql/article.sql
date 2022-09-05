DROP TABLE IF EXISTS article;
CREATE TABLE article
(
    article_ID    INT            NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    article_title VARCHAR(900)   NOT NULL DEFAULT '' COMMENT '文章标题',
    article_type  INT            NOT NULL DEFAULT 1 COMMENT '文章类型 1 通知公告 2 政策法规',
    article_top   INT            NOT NULL DEFAULT 2 COMMENT '是否置顶 1 置顶 2 不置顶',
    terminal_type INT            NOT NULL DEFAULT 1 COMMENT '发布终端 1 小程序 2PC',
    start_time    DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '对外发布开始时间',
    end_time      DATETIME COMMENT '对外发布截止时间',
    article_detai VARCHAR(20000) NOT NULL DEFAULT '' COMMENT '文章内容',
    sort          INT            NOT NULL DEFAULT 0 COMMENT '排序 越大越考前',
    `status`      INT            NOT NULL DEFAULT 1 COMMENT '状态',
    DEL_FLAG      VARCHAR(255)   NOT NULL DEFAULT 1 COMMENT '删除标志 1 正常 2 删除',
    REMARK        VARCHAR(255)   NOT NULL DEFAULT '' COMMENT '文章概述 （备注）',
    CREATE_BY     VARCHAR(255)   NOT NULL DEFAULT 'sys' COMMENT '创建人',
    CREATE_TIME   DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
    UPDATE_BY     VARCHAR(32)    NOT NULL DEFAULT 'sys' COMMENT '更新人',
    UPDATE_TIME   DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '更新时间',
    PRIMARY KEY (article_ID)
) COMMENT = '文章';

-- 菜单 SQL
-- insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
-- values('文章', '3', '1', 'article', 'supervise/article/index', 1, 0, 'C', '0', '0', 'supervise:article:list', '#', 'admin', sysdate(), '', null, '文章菜单');
#
# -- 按钮父菜单ID
# SELECT @parentId := LAST_INSERT_ID();
#
# -- 按钮 SQL
# insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
# values('文章查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'supervise:article:query',        '#', 'admin', sysdate(), '', null, '');
#
# insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
# values('文章新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'supervise:article:add',          '#', 'admin', sysdate(), '', null, '');
#
# insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
# values('文章修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'supervise:article:edit',         '#', 'admin', sysdate(), '', null, '');
#
# insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
# values('文章删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'supervise:article:remove',       '#', 'admin', sysdate(), '', null, '');
#
# insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
# values('文章导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'supervise:article:export',       '#', 'admin', sysdate(), '', null, '');
