package com.zzhy.supervise.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zzhy.common.core.domain.BaseEntity;

import java.util.Date;

public class SchCollegesTimelimit extends BaseEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 招生报名时限名称
     */
    private String timelimitName;

    private Byte fosterType;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date attendEndTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date attendStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date admissionEndTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date admissionStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date enrollEndTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date enrollStartTime;

    private String enrollQuota;

    private Byte timelimitType;

    private Integer yearTime;

    private Byte season;

    private Byte status;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimelimitName() {
        return timelimitName;
    }

    public void setTimelimitName(String timelimitName) {
        this.timelimitName = timelimitName;
    }

    public Byte getFosterType() {
        return fosterType;
    }

    public void setFosterType(Byte fosterType) {
        this.fosterType = fosterType;
    }

    public Date getAttendEndTime() {
        return attendEndTime;
    }

    public void setAttendEndTime(Date attendEndTime) {
        this.attendEndTime = attendEndTime;
    }

    public Date getAttendStartTime() {
        return attendStartTime;
    }

    public void setAttendStartTime(Date attendStartTime) {
        this.attendStartTime = attendStartTime;
    }

    public Date getAdmissionEndTime() {
        return admissionEndTime;
    }

    public void setAdmissionEndTime(Date admissionEndTime) {
        this.admissionEndTime = admissionEndTime;
    }

    public Date getAdmissionStartTime() {
        return admissionStartTime;
    }

    public void setAdmissionStartTime(Date admissionStartTime) {
        this.admissionStartTime = admissionStartTime;
    }

    public Date getEnrollEndTime() {
        return enrollEndTime;
    }

    public void setEnrollEndTime(Date enrollEndTime) {
        this.enrollEndTime = enrollEndTime;
    }

    public Date getEnrollStartTime() {
        return enrollStartTime;
    }

    public void setEnrollStartTime(Date enrollStartTime) {
        this.enrollStartTime = enrollStartTime;
    }

    public String getEnrollQuota() {
        return enrollQuota;
    }

    public void setEnrollQuota(String enrollQuota) {
        this.enrollQuota = enrollQuota;
    }

    public Byte getTimelimitType() {
        return timelimitType;
    }

    public void setTimelimitType(Byte timelimitType) {
        this.timelimitType = timelimitType;
    }

    public Integer getYearTime() {
        return yearTime;
    }

    public void setYearTime(Integer yearTime) {
        this.yearTime = yearTime;
    }

    public Byte getSeason() {
        return season;
    }

    public void setSeason(Byte season) {
        this.season = season;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }



}