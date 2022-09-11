package com.example.nanqiao.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class ActivityApplyStatisticsDO implements Serializable {
    private Long id;

    private Long activityId;

    private String activityName;

    private Integer maleNumber;

    private Integer femaleNumber;

    private Integer applyNumber;

    private Integer applySuccessNumber;

    private Integer version;

    private Date gmtCreate;

    private Date gmtModified;

    private String ageRange;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Integer getMaleNumber() {
        return maleNumber;
    }

    public void setMaleNumber(Integer maleNumber) {
        this.maleNumber = maleNumber;
    }

    public Integer getFemaleNumber() {
        return femaleNumber;
    }

    public void setFemaleNumber(Integer femaleNumber) {
        this.femaleNumber = femaleNumber;
    }

    public Integer getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(Integer applyNumber) {
        this.applyNumber = applyNumber;
    }

    public Integer getApplySuccessNumber() {
        return applySuccessNumber;
    }

    public void setApplySuccessNumber(Integer applySuccessNumber) {
        this.applySuccessNumber = applySuccessNumber;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange == null ? null : ageRange.trim();
    }
}