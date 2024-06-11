package com.msb.hjy_backend.community.service;

import com.msb.hjy_backend.community.domain.HjyCommunity;
import com.msb.hjy_backend.community.domain.dto.HjyCommunityDto;
import com.msb.hjy_backend.community.domain.vo.HjyCommunityVo;

import java.util.List;

public interface HjyCommunityService {


    public List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity);

    int insertHjyCommunity(HjyCommunity hjyCommunity);

    HjyCommunity selectHjyCommunityById(long communityId);

    /**
     * 修改小区
     * @param hjyCommunity
     * @return
     */
    int updateHjyCommunity(HjyCommunity hjyCommunity);

    int deleteHjyCommunity(Long[] hjyCommunityIds);

    // 获取小区下拉列表
    List<HjyCommunityVo> queryPullDown(HjyCommunity hjyCommunity);
}
