package com.example.nanqiao.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class ActivityInfoDO implements Serializable {
    private Long id;

    private Long activityId;

    private String title;

    private String imagePath;

    private String descPath;

    private String contentPath;

    private String attentionPath;

    private Integer numberLimit;

    private String address;

    private Date startTime;

    private Date gmtCreate;

    private Date gmtModified;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getDescPath() {
        return descPath;
    }

    public void setDescPath(String descPath) {
        this.descPath = descPath == null ? null : descPath.trim();
    }

    public String getContentPath() {
        return contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath == null ? null : contentPath.trim();
    }

    public String getAttentionPath() {
        return attentionPath;
    }

    public void setAttentionPath(String attentionPath) {
        this.attentionPath = attentionPath == null ? null : attentionPath.trim();
    }

    public Integer getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
}