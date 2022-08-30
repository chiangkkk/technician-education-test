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
