package com.zzhy.colleges.controller;

import com.zzhy.common.annotation.Log;
import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.domain.entity.SysUser;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.common.enums.BusinessType;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.supervise.domain.School;
import com.zzhy.supervise.service.ISchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 院校Controller
 *
 * @author zzhy
 * @date 2021-11-11
 */
@Api("院校信息管理")
@RestController
@RequestMapping("/supervise/school")
public class SchoolController extends BaseController
{
    @Autowired
    private ISchoolService schoolService;

    /**
     * 查询院校列表
     */
    @ApiOperation("查询院校列表")
    @ApiImplicitParam(name = "school", value = "院校",  dataType = "School", paramType = "body",dataTypeClass = School.class)
//    @PreAuthorize("@ss.hasPermi('supervise:school:list')")
    @GetMapping("/list")
    public TableDataInfo list(School school)
    {
        startPage();
        List<School> list = schoolService.selectSchoolList(school);
        return getDataTable(list);
    }

    /**
     * 导出院校列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:school:export')")
    @Log(title = "院校", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, School school)
    {
        List<School> list = schoolService.selectSchoolList(school);
        ExcelUtil<School> util = new ExcelUtil<School>(School.class);
        return util.exportExcel(list, "院校数据");
    }

    /**
     * 获取院校详细信息
     */
    @ApiOperation("获取院校详细信息")
    @ApiImplicitParam(name = "schoolId", value = "院校ID",  dataType = "Long", paramType = "path",dataTypeClass = Long.class)
//    @PreAuthorize("@ss.hasPermi('supervise:school:query')")
    @GetMapping("/getInfo")
    public AjaxResult getInfo(@RequestParam("schoolId") Long schoolId)
    {
        return AjaxResult.success(schoolService.selectSchoolBySchoolId(schoolId));
    }

    /**
     * 获取系统内转入院校详细信息
     */
    @ApiOperation("获取系统内转入院校详细信息")
    @ApiImplicitParam(name = "schoolId", value = "院校ID",  dataType = "Long", paramType = "path",dataTypeClass = Long.class)
    @PreAuthorize("@ss.hasPermi('supervise:school:getTransferInInfo')")
    @GetMapping("/getTransferInInfo")
    public TableDataInfo getTransferInInfo()
    {
        SysUser user = getLoginUser().getUser();
        startPage();
        return getDataTable(schoolService.getTransferInInfo(user));
    }

    /**
     * 根据用户查看院校详细信息
     */
    @ApiOperation("获取院校详细信息")
    @PreAuthorize("@ss.hasPermi('supervise:myschool:query')")
    @GetMapping("/getMySchoolInfo")
    public AjaxResult getMySchoolInfo()
    {
        SysUser user = getLoginUser().getUser();
        return AjaxResult.success(schoolService.selectSchoolBySchoolId(user.getSchoolId()));
    }

    /**
     * 根据院校名称，院校代码，状态查询院校信息
     *
     * @param schoolName 院校名称
     * @param schoolCode 院校代码
     * @param status 院校状态
     * @return 院校集合
     */
    @ApiOperation("根据院校名称，院校代码，院校状态查询院校信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "schoolName", value = "院校名称",  dataType = "String", dataTypeClass = String.class),
            @ApiImplicitParam(name = "schoolCode", value = "院校代码",  dataType = "String", dataTypeClass = String.class),
            @ApiImplicitParam(name = "status", value = "院校状态",  dataType = "String", dataTypeClass = String.class)
    })
//    @PreAuthorize("@ss.hasPermi('supervise:school:query')")
    @GetMapping(value = "/query")
    public TableDataInfo query(@RequestParam(value = "schoolName",required = false) String schoolName, @RequestParam(value = "schoolCode",required = false) String schoolCode, @RequestParam(value = "status",required = false) String status){
        startPage();
        List<School> list = schoolService.queryBySchoolNameAndSchoolCodeAndStatus(schoolName, schoolCode, status);
        return getDataTable(list);
    }

    /**
     * 新增院校
     */
    @ApiOperation("新增院校")
    @ApiImplicitParam(name = "school", value = "院校",  dataType = "School", paramType = "path",dataTypeClass = School.class)
    @PreAuthorize("@ss.hasPermi('supervise:school:add')")
    @Log(title = "院校", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody School school)
    {
        return AjaxResult.judgeJsonObject(schoolService.insertSchool(school));
    }

    /**
     * 修改院校
     */
    @ApiOperation("修改院校")
    @ApiImplicitParam(name = "school", value = "院校",  dataType = "School", paramType = "path",dataTypeClass = School.class)
    @PreAuthorize("@ss.hasPermi('supervise:school:edit')")
    @Log(title = "院校", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody School school)
    {
        return toAjax(schoolService.updateSchool(school));
    }

    /**
     * 修改根据院校ID修改院校状态
     *
     * @param schoolId
     * @return
     */
    @ApiOperation("修改院校状态   0 正常，1停用，2停办")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "schoolId", value = "院校ID",  dataType = "Long", paramType = "path",dataTypeClass = Long.class),
            @ApiImplicitParam(name = "status", value = "院校状态",  dataType = "String", paramType = "path",dataTypeClass = String.class)
    })
    @PreAuthorize("@ss.hasPermi('supervise:school:stop')")
    @Log(title = "院校", businessType = BusinessType.UPDATE)
    @GetMapping("/update")
    public AjaxResult update(@RequestParam("schoolId") Long schoolId, @RequestParam("status") String status)
    {
        return toAjax(schoolService.updateStatus(schoolId,status));
    }

    /**
     * 删除院校
     */
    @ApiOperation("删除院校")
    @ApiImplicitParam(name = "schoolIds", value = "院校ID",  dataType = "Long", paramType = "path",dataTypeClass = Long.class)
    @PreAuthorize("@ss.hasPermi('supervise:school:remove')")
    @Log(title = "院校", businessType = BusinessType.DELETE)
	@DeleteMapping
    public AjaxResult remove(@RequestParam("schoolIds") Long[] schoolIds)
    {
        return toAjax(schoolService.deleteSchoolBySchoolIds(schoolIds));
    }




}
