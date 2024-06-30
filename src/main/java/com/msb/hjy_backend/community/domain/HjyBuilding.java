package com.msb.hjy_backend.community.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 楼栋 (HjyBuilding)实体类
 *
 * @author huangaar
 * @since 2024-06-29 12:15:52
 */

public class HjyBuilding implements Serializable {
    private static final long serialVersionUID = -48862125010756600L;
/**
     * 楼栋id
     */

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long buildingId;
/**
     * 楼栋名称
     */
    private String buildingName;
/**
     * 楼栋编码
     */
    private String buildingCode;
/**
     * 楼栋面积
     */
    private Double buildingAcreage;
/**
     * 小区id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;
/**
     * 创建者
     */
    private String createBy;
/**
     * 创建时间
     */
    private Date createTime;
/**
     * 更新者
     */
    private String updateBy;
/**
     * 更新时间
     */
    private Date updateTime;
/**
     * 备注
     */
    private String remark;


    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public Double getBuildingAcreage() {
        return buildingAcreage;
    }

    public void setBuildingAcreage(Double buildingAcreage) {
        this.buildingAcreage = buildingAcreage;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

