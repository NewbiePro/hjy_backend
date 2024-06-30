package com.msb.hjy_backend.community.service.impl;

import com.msb.hjy_backend.community.domain.HjyBuilding;
import com.msb.hjy_backend.community.domain.dto.HjyBuildingDto;
import com.msb.hjy_backend.community.mapper.HjyBuildingMapper;
import com.msb.hjy_backend.community.service.HjyBuildingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 楼栋 (HjyBuilding)表服务实现类
 *
 * @author huangaar
 * @since 2024-06-29 12:15:55
 */
@Service
public class HjyBuildingServiceImpl implements HjyBuildingService {
    @Resource
    private HjyBuildingMapper hjyBuildingMapper;


    @Override
    public List<HjyBuildingDto> queryList(HjyBuilding hjyBuilding) {
        return hjyBuildingMapper.queryList(hjyBuilding);
    }

    @Override
    public int insertHjyBuilding(HjyBuilding hjyBuilding) {
        return 0;
    }

    @Override
    public HjyBuilding selectHjyBuilding(long buildingId) {
        return null;
    }
}
