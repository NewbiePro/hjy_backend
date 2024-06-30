package com.msb.hjy_backend.community.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.msb.hjy_backend.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;


@Data
public class HjyBuildingDto extends BaseEntity  {
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
    private String communityName;
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
}
