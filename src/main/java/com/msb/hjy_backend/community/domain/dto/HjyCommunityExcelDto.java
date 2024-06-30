package com.msb.hjy_backend.community.domain.dto;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@ExcelTarget("community")
public class HjyCommunityExcelDto{

    @Excel(name="community id",orderNum = "1",width = 15.0)
    private Long communityId;

    @Excel(name="commuity name",orderNum = "2", width = 15.0)
    private String communityName;

    @Excel(name="community code", orderNum = "3", width = 15.0)
    private String communityCode;

    @Excel(name="province name", orderNum = "4", width = 15.0)
    private String communityProvinceName;

    @Excel(name="city name", orderNum = "5", width = 15.0)
    private String communityCityName;

    @Excel(name="town name", orderNum = "6", width = 15.0)
    private String communityTownName;

    @Excel(name="create time", format = "yyyy-MM-dd HH:mm:ss", orderNum = "7", width = 15.0)
    private Date createTime;

    @Excel(name="remark", orderNum = "8", width = 15.0)
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
}
