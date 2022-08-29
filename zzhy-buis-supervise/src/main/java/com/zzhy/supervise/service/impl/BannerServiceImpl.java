package com.zzhy.supervise.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.supervise.mapper.BannerMapper;
import com.zzhy.supervise.domain.Banner;
import com.zzhy.supervise.service.IBannerService;

/**
 * 轮播图Service业务层处理
 * 
 * @author zzhy
 * @date 2022-08-29
 */
@Service
public class BannerServiceImpl implements IBannerService 
{
    @Autowired
    private BannerMapper bannerMapper;

    /**
     * 查询轮播图
     * 
     * @param bannerId 轮播图主键
     * @return 轮播图
     */
    @Override
    public Banner selectBannerByBannerId(Long bannerId)
    {
        return bannerMapper.selectBannerByBannerId(bannerId);
    }

    /**
     * 查询轮播图列表
     * 
     * @param banner 轮播图
     * @return 轮播图
     */
    @Override
    public List<Banner> selectBannerList(Banner banner)
    {
        return bannerMapper.selectBannerList(banner);
    }

    /**
     * 新增轮播图
     * 
     * @param banner 轮播图
     * @return 结果
     */
    @Override
    public int insertBanner(Banner banner)
    {
        return bannerMapper.insertBanner(banner);
    }

    /**
     * 修改轮播图
     * 
     * @param banner 轮播图
     * @return 结果
     */
    @Override
    public int updateBanner(Banner banner)
    {
        return bannerMapper.updateBanner(banner);
    }

    /**
     * 批量删除轮播图
     * 
     * @param bannerIds 需要删除的轮播图主键
     * @return 结果
     */
    @Override
    public int deleteBannerByBannerIds(Long[] bannerIds)
    {
        return bannerMapper.deleteBannerByBannerIds(bannerIds);
    }

    /**
     * 删除轮播图信息
     * 
     * @param bannerId 轮播图主键
     * @return 结果
     */
    @Override
    public int deleteBannerByBannerId(Long bannerId)
    {
        return bannerMapper.deleteBannerByBannerId(bannerId);
    }
}
