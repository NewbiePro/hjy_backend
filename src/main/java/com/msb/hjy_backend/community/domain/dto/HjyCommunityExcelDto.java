package com.msb.hjy_backend.community.domain.dto;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@ExcelTarget("community")
public class HjyCommunityExcelDto implements Serializable {

    @Excel(name="community_id",orderNum = "1")
    private Long communityId;

    @Excel(name="community_name",orderNum = "2")
    private String communityName;

    @Excel(name="community_code", orderNum = "3")
    private String communityCode;

    @Excel(name="province_name", orderNum = "4")
    private String communityProvinceName;

    @Excel(name="city_name", orderNum = "5")
    private String communityCityName;

    @Excel(name="town_name", orderNum = "6")
    private String communityTownName;

    @Excel(name="create_time", format = "yyyy-MM-dd HH:mm:ss", orderNum = "7")
    private Date createTime;

    @Excel(name="备注", orderNum = "8")
    private String remark;

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public String getCommunityProvinceName() {
        return communityProvinceName;
    }

    public void setCommunityProvinceName(String communityProvinceName) {
        this.communityProvinceName = communityProvinceName;
    }

    public String getCommunityCityName() {
        return communityCityName;
    }

    public void setCommunityCityName(String communityCityName) {
        this.communityCityName = communityCityName;
    }

    public String getCommunityTownName() {
        return communityTownName;
    }

    public void setCommunityTownName(String communityTownName) {
        this.communityTownName = communityTownName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public HjyCommunityExcelDto() {
    }

    public HjyCommunityExcelDto(Long communityId, String communityName, String communityCode, String communityProvinceName, String communityCityName, String communityTownName, Date createTime, String remark) {
        this.communityId = communityId;
        this.communityName = communityName;
        this.communityCode = communityCode;
        this.communityProvinceName = communityProvinceName;
        this.communityCityName = communityCityName;
        this.communityTownName = communityTownName;
        this.createTime = createTime;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "HjyCommunityExcelDto{" +
                "communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", communityCode='" + communityCode + '\'' +
                ", communityProvinceName='" + communityProvinceName + '\'' +
                ", communityCityName='" + communityCityName + '\'' +
                ", communityTownName='" + communityTownName + '\'' +
                ", createTime=" + createTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
