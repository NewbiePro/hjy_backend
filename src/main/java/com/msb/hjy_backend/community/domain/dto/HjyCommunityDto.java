package com.msb.hjy_backend.community.domain.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.msb.hjy_backend.common.core.domain.BaseEntity;
import lombok.Data;

import java.io.Serial;

//展示页面
@Data
public class HjyCommunityDto extends BaseEntity {


    @Serial
    private static final long serialVersionUID = -1708144701179687090L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;

    private String communityName;

    // 小区编码
    private String communityCode;

    // 省区划码
    private String communityProvinceCode;

    private String communityProvinceName;
    // 市区划码
    private String communityCityCode;

    private String communityCityName;
    // 区县划码
    private String communityTownCode;

    private String communityTownName;

    // 详细地址
    private String communityDetailedAddress;

    //经度
    private String longitude;

    //纬度
    private String latitude;

    //物业Id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long deptId;


    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communitySort;
}
