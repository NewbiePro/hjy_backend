package com.msb.hjy_backend.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.hjy_backend.community.domain.HjyBuilding;
import com.msb.hjy_backend.community.domain.dto.HjyBuildingDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HjyBuildingMapper extends BaseMapper<HjyBuilding> {

    @Select("select hb.*, hc.community_name as communityName \n" +
            "from hjy_building hb left join hjy_community hc on hb.community_id =  hc.community_id")
    List<HjyBuildingDto> queryList(HjyBuilding hjyBuilding);
}
