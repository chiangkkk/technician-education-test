package com.zzhy.supervise.mapper;

import java.util.List;
import com.zzhy.supervise.domain.Article;

/**
 * 文章Mapper接口
 * 
 * @author zzhy
 * @date 2022-08-30
 */
public interface ArticleMapper 
{
    /**
     * 查询文章
     * 
     * @param articleId 文章主键
     * @return 文章
     */
    public Article selectArticleByArticleId(Long articleId);

    /**
     * 查询文章列表
     * 
     * @param article 文章
     * @return 文章集合
     */
    public List<Article> selectArticleList(Article article);

    /**
     * 新增文章
     * 
     * @param article 文章
     * @return 结果
     */
    public int insertArticle(Article article);

    /**
     * 修改文章
     * 
     * @param article 文章
     * @return 结果
     */
    public int updateArticle(Article article);

    /**
     * 删除文章
     * 
     * @param articleId 文章主键
     * @return 结果
     */
    public int deleteArticleByArticleId(Long articleId);

    /**
     * 批量删除文章
     * 
     * @param articleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArticleByArticleIds(Long[] articleIds);
}
