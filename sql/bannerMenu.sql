-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('轮播图', '3', '1', 'banner', 'supervise/banner/index', 1, 0, 'C', '0', '0', 'supervise:banner:list', '#', 'admin', sysdate(), '', null, '轮播图菜单');

-- 按钮父菜单ID
SELECT @parentId := 2559;

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('轮播图查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'supervise:banner:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('轮播图新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'supervise:banner:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('轮播图修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'supervise:banner:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('轮播图删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'supervise:banner:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('轮播图导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'supervise:banner:export',       '#', 'admin', sysdate(), '', null, '');