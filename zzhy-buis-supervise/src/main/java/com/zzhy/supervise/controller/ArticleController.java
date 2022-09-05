package com.zzhy.supervise.controller;

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
import com.zzhy.supervise.domain.Article;
import com.zzhy.supervise.service.IArticleService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

/**
 * 文章Controller
 * 
 * @author zzhy
 * @date 2022-08-30
 */
@RestController
@RequestMapping("/supervise/article")
public class ArticleController extends BaseController
{
    @Autowired
    private IArticleService articleService;

    /**
     * 查询文章列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:article:list')")
    @GetMapping("/list")
    public TableDataInfo list(Article article)
    {
        startPage();
        List<Article> list = articleService.selectArticleList(article);
        return getDataTable(list);
    }

    /**
     * 导出文章列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:article:export')")
    @Log(title = "文章", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Article article)
    {
        List<Article> list = articleService.selectArticleList(article);
        ExcelUtil<Article> util = new ExcelUtil<Article>(Article.class);
        util.exportExcel(response, list, "文章数据");
    }

    /**
     * 获取文章详细信息
     */
    @PreAuthorize("@ss.hasPermi('supervise:article:query')")
    @GetMapping(value = "/getInfo/{articleId}")
    public AjaxResult getInfo(@PathVariable("articleId") Long articleId)
    {
        return AjaxResult.success(articleService.selectArticleByArticleId(articleId));
    }

    /**
     * 新增文章
     */
    @PreAuthorize("@ss.hasPermi('supervise:article:add')")
    @Log(title = "文章", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Article article)
    {
        return toAjax(articleService.insertArticle(article));
    }

    /**
     * 修改文章
     */
    @PreAuthorize("@ss.hasPermi('supervise:article:edit')")
    @Log(title = "文章", businessType = BusinessType.UPDATE)
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Article article)
    {
        return toAjax(articleService.updateArticle(article));
    }

    /**
     * 删除文章
     */
    @PreAuthorize("@ss.hasPermi('supervise:article:remove')")
    @Log(title = "文章", businessType = BusinessType.DELETE)
	@DeleteMapping("/tombstone/{articleIds}")
    public AjaxResult remove(@PathVariable Long[] articleIds)
    {
        return toAjax(articleService.deleteArticleByArticleIds(articleIds));
    }
}
