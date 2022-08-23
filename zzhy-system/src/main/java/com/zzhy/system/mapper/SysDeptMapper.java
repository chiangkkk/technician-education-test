package com.zzhy.system.mapper;

import com.zzhy.common.core.domain.entity.SysDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 部门管理 数据层
 * 
 * @author ruoyi
 */
public interface SysDeptMapper
{
    /**
     * 查询部门管理数据
     * 
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 根据角色ID查询部门树信息
     * 
     * @param roleId 角色ID
     * @param deptCheckStrictly 部门树选择项是否关联显示
     * @return 选中部门列表
     */
    public List<Long> selectDeptListByRoleId(@Param("roleId") Long roleId, @Param("deptCheckStrictly") boolean deptCheckStrictly);

    /**
     * 根据部门ID查询信息
     * 
     * @param deptId 部门ID
     * @return 部门信息
     */
    public SysDept selectDeptById(Long deptId);

    /**
     * 根据ID查询所有子部门
     * 
     * @param deptId 部门ID
     * @return 部门列表
     */
    public List<SysDept> selectChildrenDeptById(Long deptId);

    /**
     * 根据ID查询所有子部门（正常状态）
     * 
     * @param deptId 部门ID
     * @return 子部门数
     */
    public int selectNormalChildrenDeptById(Long deptId);

    /**
     * 是否存在子节点
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    public int hasChildByDeptId(Long deptId);

    /**
     * 查询部门是否存在用户
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    public int checkDeptExistUser(Long deptId);

    /**
     * 校验部门名称是否唯一
     * 
     * @param deptName 部门名称
     * @param parentId 父部门ID
     * @return 结果
     */
    public SysDept checkDeptNameUnique(@Param("deptName") String deptName, @Param("parentId") Long parentId);

    /**
     * 新增部门信息
     * 
     * @param dept 部门信息
     * @return 结果
     */
    public int insertDept(SysDept dept);

    /**
     * 修改部门信息
     * 
     * @param dept 部门信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 修改所在部门正常状态
     * 
     * @param deptIds 部门ID组
     */
    public void updateDeptStatusNormal(Long[] deptIds);

    /**
     * 修改根据部门ID修改部门状态
     *
     * @param deptId
     * @param status
     * @return
     */
    public int updateStatus(@Param("schoolId") Long deptId, @Param("status") String status);


    /**
     * 修改子元素关系
     * 
     * @param depts 子元素
     * @return 结果
     */
    public int updateDeptChildren(@Param("depts") List<SysDept> depts);

    /**
     * 删除部门管理信息
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);

    List<SysDept> selectDeptByIds(List<Long> deptIds);
    /**
     * 查询子部门ids
     */
    public List<Long> queryChildDeptIdsBySelfDeptId(Long deptId);

    List<SysDept> selectDeptAllList(SysDept dept);

    /**
     * 查询一个部门的父级
     * @param deptId
     * @return
     */
    String selectAllParentDeptIds(Long deptId);
    /**
     * 查询一个部门的包括自己
     * @param deptId
     * @return
     */
    String selectAllParentAndSelf(Long deptId);

    /**
     * 查询自己部门和自己下面子部门的集合
     * @param deptId
     * @return
     */
    List<Long> selectChildrenDeptAndSelfDeptIdList(Long deptId);
    /**
     *
     * @param deptIdList
     * @return
     */
    List<Long> selectDeptByIdsOrderByHierarchy(List<Long> deptIdList);

    Long queryChildrenDeptAndSelfDeptId(@Param("orderDeptId") Long orderDeptId,@Param("schoolDeptId") Long schoolDeptId);

    List<SysDept> selectOrganizationId();
}
