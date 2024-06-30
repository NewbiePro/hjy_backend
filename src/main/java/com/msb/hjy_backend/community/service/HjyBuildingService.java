package com.msb.hjy_backend.community.service;

import com.msb.hjy_backend.community.domain.HjyBuilding;
import com.msb.hjy_backend.community.domain.HjyCommunity;
import com.msb.hjy_backend.community.domain.dto.HjyBuildingDto;
import com.msb.hjy_backend.community.domain.dto.HjyCommunityDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 楼栋 (HjyBuilding)表服务接口
 *
 * @author huangaar
 * @since 2024-06-29 12:15:55
 */


public interface HjyBuildingService {

    public List<HjyBuildingDto> queryList(HjyBuilding hjyBuilding);

    int insertHjyBuilding (HjyBuilding hjyBuilding);

    HjyBuilding selectHjyBuilding(long buildingId);

}
