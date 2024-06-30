package com.msb.hjy_backend.community.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 楼栋 (HjyBuilding)实体类
 *
 * @author huangaar
 * @since 2024-06-29 12:15:52
 */

public class HjyBuildingVo implements Serializable {
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



}

