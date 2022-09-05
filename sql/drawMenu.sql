-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('转盘抽奖', '3', '1', 'draw', 'shopping/draw/index', 1, 0, 'C', '0', '0', 'shopping:draw:list', '#', 'admin', sysdate(), '', null, '转盘抽奖菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('转盘抽奖查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'shopping:draw:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('转盘抽奖新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'shopping:draw:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('转盘抽奖修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'shopping:draw:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('转盘抽奖删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'shopping:draw:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('转盘抽奖导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'shopping:draw:export',       '#', 'admin', sysdate(), '', null, '');