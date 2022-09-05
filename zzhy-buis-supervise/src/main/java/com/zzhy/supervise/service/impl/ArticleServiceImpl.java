package com.zzhy.supervise.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.supervise.mapper.ArticleMapper;
import com.zzhy.supervise.domain.Article;
import com.zzhy.supervise.service.IArticleService;

/**
 * 文章Service业务层处理
 * 
 * @author zzhy
 * @date 2022-08-30
 */
@Service
public class ArticleServiceImpl implements IArticleService 
{
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 查询文章
     * 
     * @param articleId 文章主键
     * @return 文章
     */
    @Override
    public Article selectArticleByArticleId(Long articleId)
    {
        return articleMapper.selectArticleByArticleId(articleId);
    }

    /**
     * 查询文章列表
     * 
     * @param article 文章
     * @return 文章
     */
    @Override
    public List<Article> selectArticleList(Article article)
    {
        return articleMapper.selectArticleList(article);
    }

    /**
     * 新增文章
     * 
     * @param article 文章
     * @return 结果
     */
    @Override
    public int insertArticle(Article article)
    {
        article.setCreateTime(DateUtils.getNowDate());
        return articleMapper.insertArticle(article);
    }

    /**
     * 修改文章
     * 
     * @param article 文章
     * @return 结果
     */
    @Override
    public int updateArticle(Article article)
    {
        article.setUpdateTime(DateUtils.getNowDate());
        return articleMapper.updateArticle(article);
    }

    /**
     * 批量删除文章
     * 
     * @param articleIds 需要删除的文章主键
     * @return 结果
     */
    @Override
    public int deleteArticleByArticleIds(Long[] articleIds)
    {
        return articleMapper.deleteArticleByArticleIds(articleIds);
    }

    /**
     * 删除文章信息
     * 
     * @param articleId 文章主键
     * @return 结果
     */
    @Override
    public int deleteArticleByArticleId(Long articleId)
    {
        return articleMapper.deleteArticleByArticleId(articleId);
    }
}
