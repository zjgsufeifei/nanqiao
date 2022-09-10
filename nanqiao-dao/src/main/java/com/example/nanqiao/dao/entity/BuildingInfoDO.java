package com.example.nanqiao.dao.entity;

import java.io.Serializable;

public class BuildingInfoDO implements Serializable {
    private Integer id;

    private String buildingName;

    private String buildingDetail;

    private Integer gridId;

    private String gridName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getBuildingDetail() {
        return buildingDetail;
    }

    public void setBuildingDetail(String buildingDetail) {
        this.buildingDetail = buildingDetail == null ? null : buildingDetail.trim();
    }

    public Integer getGridId() {
        return gridId;
    }

    public void setGridId(Integer gridId) {
        this.gridId = gridId;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName == null ? null : gridName.trim();
    }
}