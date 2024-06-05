package com.msb.hjy_backend.community.service.impl;

import com.msb.hjy_backend.community.domain.HjyCommunity;
import com.msb.hjy_backend.community.domain.dto.HjyCommunityDto;
import com.msb.hjy_backend.community.mapper.HjyCommunityMapper;
import com.msb.hjy_backend.community.service.HjyCommunityService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HjyCommunityServiceImpl implements HjyCommunityService {
    @Resource
    private HjyCommunityMapper hjyCommunityMapper;

    private static final String CODE_PREIX = "COMMUNITY_";
    @Override
    public List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity) {
        return hjyCommunityMapper.queryList(hjyCommunity);
    }

    @Override
    public int insertHjyCommunity(HjyCommunity hjyCommunity) {
        // 设置小区编码
        hjyCommunity.setCommunityCode(CODE_PREIX + System.currentTimeMillis());
        return hjyCommunityMapper.insert(hjyCommunity);
    }

    @Override
    public HjyCommunity selectHjyCommunityById(long communityId) {
        return hjyCommunityMapper.selectById(communityId);
    }

    @Override
    public int updateHjyCommunity(HjyCommunity hjyCommunity) {
        System.out.println(hjyCommunity);
        return hjyCommunityMapper.updateById(hjyCommunity);
    }

    @Override
    public int deleteHjyCommunity(Long[] hjyCommunityIds) {
        return hjyCommunityMapper.deleteBatchIds(Arrays.asList(hjyCommunityIds));
    }
}
