package com.msb.hjy_backend.community.domain.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.msb.hjy_backend.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;


@Data
public class HjyBuildingExcelDto {
    /**
     * 楼栋id
     */

    @Excel(name="building id",orderNum = "1",width = 15.0)
    private Long buildingId;
    /**
     * 楼栋名称
     */
    @Excel(name="building name",orderNum = "2",width = 15.0)
    private String buildingName;
    /**
     * 楼栋编码
     */
    @Excel(name="building code",orderNum = "3",width = 15.0)
    private String buildingCode;
    /**
     * 楼栋面积
     */
    @Excel(name="building acreage",orderNum = "4",width = 15.0)
    private Double buildingAcreage;
    /**
     * 小区id
     */
    @Excel(name="community id",orderNum = "5",width = 15.0)
    private Long communityId;
    @Excel(name="community name",orderNum = "6",width = 15.0)
    private String communityName;

    @Excel(name="create time", format = "yyyy-MM-dd HH:mm:ss", orderNum = "7", width = 15.0)
    private Date createTime;
    @Excel(name="remark", format = "yyyy-MM-dd HH:mm:ss", orderNum = "8", width = 15.0)
    private String remark;
}
