package com.zzhy.colleges.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zzhy.common.annotation.Log;
import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.enums.BusinessType;
import com.zzhy.supervise.domain.CollegesAttachment;
import com.zzhy.supervise.service.ICollegesAttachmentService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

/**
 * 院校端申报通用附件Controller
 *
 * @author zzhy
 * @date 2022-06-05
 */
@RestController
@RequestMapping("/supervise/attachment")
public class CollegesAttachmentController extends BaseController
{
    @Autowired
    private ICollegesAttachmentService collegesAttachmentService;

    /**
     * 查询院校端申报通用附件列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:attachment:list')")
    @GetMapping("/list")
    public TableDataInfo list(CollegesAttachment collegesAttachment)
    {
        startPage();
        List<CollegesAttachment> list = collegesAttachmentService.selectCollegesAttachmentList(collegesAttachment);
        return getDataTable(list);
    }

    /**
     * 导出院校端申报通用附件列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:attachment:export')")
    @Log(title = "院校端申报通用附件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CollegesAttachment collegesAttachment)
    {
        List<CollegesAttachment> list = collegesAttachmentService.selectCollegesAttachmentList(collegesAttachment);
        ExcelUtil<CollegesAttachment> util = new ExcelUtil<CollegesAttachment>(CollegesAttachment.class);
        util.exportExcel(response, list, "院校端申报通用附件数据");
    }

    /**
     * 获取院校端申报通用附件详细信息
     */
    @PreAuthorize("@ss.hasPermi('supervise:attachment:query')")
    @GetMapping(value = "/{attachmentId}")
    public AjaxResult getInfo(@PathVariable("attachmentId") Long attachmentId)
    {
        return AjaxResult.success(collegesAttachmentService.selectCollegesAttachmentByAttachmentId(attachmentId));
    }

    /**
     * 新增院校端申报通用附件
     */
    @PreAuthorize("@ss.hasPermi('supervise:attachment:add')")
    @Log(title = "院校端申报通用附件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CollegesAttachment collegesAttachment)
    {
        return toAjax(collegesAttachmentService.insertCollegesAttachment(collegesAttachment));
    }

    /**
     * 修改院校端申报通用附件
     */
    @PreAuthorize("@ss.hasPermi('supervise:attachment:edit')")
    @Log(title = "院校端申报通用附件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CollegesAttachment collegesAttachment)
    {
        return toAjax(collegesAttachmentService.updateCollegesAttachment(collegesAttachment));
    }

    /**
     * 删除院校端申报通用附件
     */
    @PreAuthorize("@ss.hasPermi('supervise:attachment:remove')")
    @Log(title = "院校端申报通用附件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{attachmentIds}")
    public AjaxResult remove(@PathVariable Long[] attachmentIds)
    {
        return toAjax(collegesAttachmentService.deleteCollegesAttachmentByAttachmentIds(attachmentIds));
    }
}
