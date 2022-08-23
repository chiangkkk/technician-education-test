package com.zzhy.common.core.domain.entity;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 区域对象 sys_areas
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@Data
public class SysAreas
{
    private static final long serialVersionUID = 1L;

    /** 区划ID */
    private Long areaId;

    /** 父ID */
    @Excel(name = "父ID")
    private Long parentId;

    /** 级别 */
    @Excel(name = "级别")
    private Long level;

    /** 全称 */
    @Excel(name = "全称")
    private String areaName;

    /** 简称 */
    @Excel(name = "简称")
    private String shortName;

    /** ID路径 */
    @Excel(name = "ID路径")
    private String parentPath;

    /** 省份全称 */
    @Excel(name = "省份全称")
    private String province;

    /** 城市全称 */
    @Excel(name = "城市全称")
    private String city;

    /** 区县全称 */
    @Excel(name = "区县全称")
    private String district;

    /** 省份简称 */
    @Excel(name = "省份简称")
    private String provinceShortName;

    /** 城市简称 */
    @Excel(name = "城市简称")
    private String cityShortName;

    /** 区县简称 */
    @Excel(name = "区县简称")
    private String districtShortName;

    /** 省份拼音 */
    @Excel(name = "省份拼音")
    private String provincePinYin;

    /** 城市拼音 */
    @Excel(name = "城市拼音")
    private String cityPinYin;

    /** 区县拼音 */
    @Excel(name = "区县拼音")
    private String districtPinYin;

    /** 拼音 */
    @Excel(name = "拼音")
    private String pinYin;

    /** 简拼 */
    @Excel(name = "简拼")
    private String jianPin;

    /** 首拼 */
    @Excel(name = "首拼")
    private String firstChar;

    /** 区号 */
    @Excel(name = "区号")
    private String cityCode;

    /** 邮编 */
    @Excel(name = "邮编")
    private String zipCode;

    /** 经度 */
    @Excel(name = "经度")
    private String longitude;

    /** 维度 */
    @Excel(name = "维度")
    private String latitude;

    //子集
    private List<SysAreas> children = new ArrayList<>();

    public void setAreaId(Long areaId) 
    {
        this.areaId = areaId;
    }

    public Long getAreaId() 
    {
        return areaId;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setLevel(Long level) 
    {
        this.level = level;
    }

    public Long getLevel() 
    {
        return level;
    }
    public void setAreaName(String areaName) 
    {
        this.areaName = areaName;
    }

    public String getAreaName() 
    {
        return areaName;
    }
    public void setShortName(String shortName) 
    {
        this.shortName = shortName;
    }

    public String getShortName() 
    {
        return shortName;
    }
    public void setParentPath(String parentPath) 
    {
        this.parentPath = parentPath;
    }

    public String getParentPath() 
    {
        return parentPath;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }
    public void setProvinceShortName(String provinceShortName) 
    {
        this.provinceShortName = provinceShortName;
    }

    public String getProvinceShortName() 
    {
        return provinceShortName;
    }
    public void setCityShortName(String cityShortName) 
    {
        this.cityShortName = cityShortName;
    }

    public String getCityShortName() 
    {
        return cityShortName;
    }
    public void setDistrictShortName(String districtShortName) 
    {
        this.districtShortName = districtShortName;
    }

    public String getDistrictShortName() 
    {
        return districtShortName;
    }
    public void setProvincePinYin(String provincePinYin) 
    {
        this.provincePinYin = provincePinYin;
    }

    public String getProvincePinYin() 
    {
        return provincePinYin;
    }
    public void setCityPinYin(String cityPinYin) 
    {
        this.cityPinYin = cityPinYin;
    }

    public String getCityPinYin() 
    {
        return cityPinYin;
    }
    public void setDistrictPinYin(String districtPinYin) 
    {
        this.districtPinYin = districtPinYin;
    }

    public String getDistrictPinYin() 
    {
        return districtPinYin;
    }
    public void setPinYin(String pinYin) 
    {
        this.pinYin = pinYin;
    }

    public String getPinYin() 
    {
        return pinYin;
    }
    public void setJianPin(String jianPin) 
    {
        this.jianPin = jianPin;
    }

    public String getJianPin() 
    {
        return jianPin;
    }
    public void setFirstChar(String firstChar) 
    {
        this.firstChar = firstChar;
    }

    public String getFirstChar() 
    {
        return firstChar;
    }
    public void setCityCode(String cityCode) 
    {
        this.cityCode = cityCode;
    }

    public String getCityCode() 
    {
        return cityCode;
    }
    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }

    public String getZipCode() 
    {
        return zipCode;
    }
    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }
    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("areaId", getAreaId())
            .append("parentId", getParentId())
            .append("level", getLevel())
            .append("areaName", getAreaName())
            .append("shortName", getShortName())
            .append("parentPath", getParentPath())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("provinceShortName", getProvinceShortName())
            .append("cityShortName", getCityShortName())
            .append("districtShortName", getDistrictShortName())
            .append("provincePinYin", getProvincePinYin())
            .append("cityPinYin", getCityPinYin())
            .append("districtPinYin", getDistrictPinYin())
            .append("pinYin", getPinYin())
            .append("jianPin", getJianPin())
            .append("firstChar", getFirstChar())
            .append("cityCode", getCityCode())
            .append("zipCode", getZipCode())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .toString();
    }
}
