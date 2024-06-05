package com.msb.hjy_backend.community.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.msb.hjy_backend.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

@NoArgsConstructor
@Data
public class HjyCommunity extends BaseEntity {

    @Serial
    private static final long serialVersionUID = -1708144701179687090L;

    @TableId
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;

    private String communityName;

    // 小区编码
    private String communityCode;

    // 省区划码
    private String communityProvinceCode;

    // 市区划码
    private String communityCityCode;

    // 区县划码
    private String communityTownCode;

    // 详细地址
    private String communityDetailedAddress;

    //经度
    private String communityLongitude;

    //纬度
    private String communityLatitude;

    //物业Id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long deptId;


    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communitySort;
}
