--删除附件信息
DELETE FROM sch_colleges_attachment WHERE source_id = ? and sch_process_id = ?
--删除生成审核人
DELETE FROM sup_declare_colleges_school_audit WHERE source_id = ?  and sch_process_config_id = ?
-- 删除主数据  sch_colleges_basic_reporting 申报流程主表
DELETE FROM sch_colleges_basic_reporting WHERE school_id = ?

-- 修改免学费公用经费 户口性质  1-国内，2-港澳台，3-国外
UPDATE sch_colleges_tuition_standard set residence_nature=1  WHERE school_id=231
