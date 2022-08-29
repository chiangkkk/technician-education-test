package com.zzhy.supervise.mapper;

import java.util.List;
import com.zzhy.supervise.domain.Banner;

/**
 * 轮播图Mapper接口
 * 
 * @author zzhy
 * @date 2022-08-29
 */
public interface BannerMapper 
{
    /**
     * 查询轮播图
     * 
     * @param bannerId 轮播图主键
     * @return 轮播图
     */
    public Banner selectBannerByBannerId(Long bannerId);

    /**
     * 查询轮播图列表
     * 
     * @param banner 轮播图
     * @return 轮播图集合
     */
    public List<Banner> selectBannerList(Banner banner);

    /**
     * 新增轮播图
     * 
     * @param banner 轮播图
     * @return 结果
     */
    public int insertBanner(Banner banner);

    /**
     * 修改轮播图
     * 
     * @param banner 轮播图
     * @return 结果
     */
    public int updateBanner(Banner banner);

    /**
     * 删除轮播图
     * 
     * @param bannerId 轮播图主键
     * @return 结果
     */
    public int deleteBannerByBannerId(Long bannerId);

    /**
     * 批量删除轮播图
     * 
     * @param bannerIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBannerByBannerIds(Long[] bannerIds);
}
