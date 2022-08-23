package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gc54Mapper;
import com.zzhy.system.domain.Gc54;
import com.zzhy.system.service.IGc54Service;

/**
 * 毕业证信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gc54ServiceImpl implements IGc54Service 
{
    @Autowired
    private Gc54Mapper gc54Mapper;

    /**
     * 查询毕业证信息
     * 
     * @param age529 毕业证信息主键
     * @return 毕业证信息
     */
    @Override
    public Gc54 selectGc54ByAge529(String age529)
    {
        return gc54Mapper.selectGc54ByAge529(age529);
    }

    /**
     * 查询毕业证信息列表
     * 
     * @param gc54 毕业证信息
     * @return 毕业证信息
     */
    @Override
    public List<Gc54> selectGc54List(Gc54 gc54)
    {
        return gc54Mapper.selectGc54List(gc54);
    }

    /**
     * 新增毕业证信息
     * 
     * @param gc54 毕业证信息
     * @return 结果
     */
    @Override
    public int insertGc54(Gc54 gc54)
    {
        return gc54Mapper.insertGc54(gc54);
    }

    /**
     * 修改毕业证信息
     * 
     * @param gc54 毕业证信息
     * @return 结果
     */
    @Override
    public int updateGc54(Gc54 gc54)
    {
        return gc54Mapper.updateGc54(gc54);
    }

    /**
     * 批量删除毕业证信息
     * 
     * @param age529s 需要删除的毕业证信息主键
     * @return 结果
     */
    @Override
    public int deleteGc54ByAge529s(String[] age529s)
    {
        return gc54Mapper.deleteGc54ByAge529s(age529s);
    }

    /**
     * 删除毕业证信息信息
     * 
     * @param age529 毕业证信息主键
     * @return 结果
     */
    @Override
    public int deleteGc54ByAge529(String age529)
    {
        return gc54Mapper.deleteGc54ByAge529(age529);
    }
}
