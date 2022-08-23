package com.zzhy.web.controller.system;

import java.util.Iterator;
import java.util.List;

import io.swagger.annotations.ApiImplicitParams;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zzhy.common.annotation.Log;
import com.zzhy.common.constant.UserConstants;
import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.domain.entity.SysDept;
import com.zzhy.common.enums.BusinessType;
import com.zzhy.common.utils.StringUtils;
import com.zzhy.system.service.ISysDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 部门信息(组织机构)
 * 
 * @author ruoyi
 */
@Api("组织机构管理")
@RestController
@RequestMapping("/system/dept")
public class SysDeptController extends BaseController
{
    @Autowired
    private ISysDeptService deptService;

    /**
     * 获取部门列表
     */
    @ApiOperation("组织机构列表")
    @ApiImplicitParam(name = "dept", value = "组织机构", dataType = "long", dataTypeClass = Long.class)
    @PreAuthorize("@ss.hasPermi('system:dept:list')")
    @GetMapping("/list")
    public AjaxResult list(SysDept dept)
    {
        List<SysDept> depts = deptService.selectDeptList(dept);
        return AjaxResult.success(depts);
    }


    /**
     * 获取部门列表
     */
    @ApiOperation("组织机构所有列表")
    @ApiImplicitParam(name = "dept", value = "组织机构", dataType = "long", dataTypeClass = Long.class)
//    @PreAuthorize("@ss.hasPermi('system:dept:allList')")
    @GetMapping("/allList")
    public AjaxResult allList(SysDept dept)
    {
        List<SysDept> depts = deptService.selectDeptAllList(dept);
        return AjaxResult.success(depts);
    }

    /**
     * 查询部门列表（排除节点）
     */
    @PreAuthorize("@ss.hasPermi('system:dept:list')")
    @GetMapping("/list/exclude/{deptId}")
    public AjaxResult excludeChild(@PathVariable(value = "deptId", required = false) Long deptId)
    {
        List<SysDept> depts = deptService.selectDeptList(new SysDept());
        Iterator<SysDept> it = depts.iterator();
        while (it.hasNext())
        {
            SysDept d = (SysDept) it.next();
            if (d.getDeptId().intValue() == deptId
                    || ArrayUtils.contains(StringUtils.split(d.getAncestors(), ","), deptId + ""))
            {
                it.remove();
            }
        }
        return AjaxResult.success(depts);
    }

    /**
     * 根据部门编号获取详细信息
     */
    @ApiOperation("获取用户详细")
    @ApiImplicitParam(name = "deptId", value = "组织ID", required = true, dataType = "long", paramType = "path", dataTypeClass = Long.class)
    @PreAuthorize("@ss.hasPermi('system:dept:query')")
    @GetMapping(value = "/{deptId}")
    public AjaxResult getInfo(@PathVariable Long deptId)
    {
        deptService.checkDeptDataScope(deptId);
        return AjaxResult.success(deptService.selectDeptById(deptId));
    }

    /**
     * 获取部门下拉树列表
     */
    @ApiOperation("获取部门下拉树列表")
    @ApiImplicitParam(name = "dept", value = "组织", required = true, dataType = "SysDept", paramType = "path", dataTypeClass = SysDept.class)
    @GetMapping("/treeselect")
    public AjaxResult treeselect(SysDept dept)
    {
        List<SysDept> depts = deptService.selectDeptList(dept);
        return AjaxResult.success(deptService.buildDeptTreeSelect(depts));
    }

    /**
     * 加载对应角色部门列表树
     */
    @GetMapping(value = "/roleDeptTreeselect/{roleId}")
    public AjaxResult roleDeptTreeselect(@PathVariable("roleId") Long roleId)
    {
        List<SysDept> depts = deptService.selectDeptList(new SysDept());
        AjaxResult ajax = AjaxResult.success();
        ajax.put("checkedKeys", deptService.selectDeptListByRoleId(roleId));
        ajax.put("depts", deptService.buildDeptTreeSelect(depts));
        return ajax;
    }

    /**
     * 新增部门
     */
    @ApiOperation("新增部门 status(1是正常，2是停用，3是停办)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "parentId", value = "父机构ID",  dataType = "Long", paramType = "path",dataTypeClass = Long.class),
            @ApiImplicitParam(name = "deptName",value = "机构名称", required = true, dataType = "String", paramType = "path", dataTypeClass = String.class),
            @ApiImplicitParam(name = "orderNum",value = "排序",  dataType = "String",  dataTypeClass = String.class),
            @ApiImplicitParam(name = "orgType",value = "机构类型", required = true, dataType = "Integer", paramType = "path", dataTypeClass = Integer.class),
            @ApiImplicitParam(name = "status",value = "状态", required = true, dataType = "String", paramType = "path", dataTypeClass = String.class),

    })
    @PreAuthorize("@ss.hasPermi('system:dept:add')")
    @Log(title = "部门管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysDept dept)
    {
        if (UserConstants.NOT_UNIQUE.equals(deptService.checkDeptNameUnique(dept)))
        {
            return AjaxResult.error("新增组织机构'" + dept.getDeptName() + "'失败，组织机构名称已存在");
        }
        dept.setCreateBy(getUsername());
        return toAjax(deptService.insertDept(dept));
    }

    /**
     * 修改部门
     */
    @PreAuthorize("@ss.hasPermi('system:dept:edit')")
    @Log(title = "部门管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysDept dept)
    {
        if (UserConstants.NOT_UNIQUE.equals(deptService.checkDeptNameUnique(dept)))
        {
            return AjaxResult.error("修改组织机构'" + dept.getDeptName() + "'失败，组织机构名称已存在");
        }
        else if (dept.getParentId().equals(dept.getDeptId()))
        {
            return AjaxResult.error("修改组织机构'" + dept.getDeptName() + "'失败，上级组织机构不能是自己");
        }
        else if (StringUtils.equals(UserConstants.DEPT_DISABLE, dept.getStatus())
                && deptService.selectNormalChildrenDeptById(dept.getDeptId()) > 0)
        {
            return AjaxResult.error("该组织机构包含未停用的子组织机构！");
        }
        dept.setUpdateBy(getUsername());
        return toAjax(deptService.updateDept(dept));
    }

    /**
     * 修改根据部门ID修改部门状态
     *
     * @param deptId
     * @return
     */
    @ApiOperation("修改部门状态   1 正常，2停用，3停办")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptId", value = "部门ID",  dataType = "Long", paramType = "path",dataTypeClass = Long.class),
            @ApiImplicitParam(name = "status", value = "部门状态",  dataType = "String", paramType = "path",dataTypeClass = String.class)
    })
    @PreAuthorize("@ss.hasPermi('supervise:school:update')")
    @Log(title = "部门", businessType = BusinessType.UPDATE)
    @PutMapping("/{classId}/{status}")
    public AjaxResult update(@PathVariable Long deptId,@PathVariable String status)
    {
        return toAjax(deptService.updateStatus(deptId,status));
    }

    /**
     * 删除部门
     */
    @PreAuthorize("@ss.hasPermi('system:dept:remove')")
    @Log(title = "部门管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{deptId}")
    public AjaxResult remove(@PathVariable Long deptId)
    {
        if (deptService.hasChildByDeptId(deptId))
        {
            return AjaxResult.error("存在下级组织机构,不允许删除");
        }
        if (deptService.checkDeptExistUser(deptId))
        {
            return AjaxResult.error("组织机构存在用户,不允许删除");
        }
        return toAjax(deptService.deleteDeptById(deptId));
    }
}
