package com.msb.hjy_backend.web.controller.common;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.msb.hjy_backend.common.core.controller.BaseController;
import com.msb.hjy_backend.common.core.domain.BaseResponse;
import com.msb.hjy_backend.common.utils.ExcelUtils;
import com.msb.hjy_backend.community.domain.HjyBuilding;
import com.msb.hjy_backend.community.domain.HjyCommunity;
import com.msb.hjy_backend.community.domain.dto.*;
import com.msb.hjy_backend.community.service.HjyBuildingService;
import com.msb.hjy_backend.community.service.HjyCommunityService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Slf4j
@RequestMapping("/exportExcel")
public class ExportExcelController extends BaseController {


    @Resource
    private HjyCommunityService communityService;
    @Resource
    private HjyBuildingService buildingService;
    /**
     * 导出小区数据
     * @param hjyCommunity
     * @param response
     * @return
     */
    @GetMapping("/exportCommunityExcel")
    public BaseResponse exportExcel(HjyCommunity hjyCommunity, HttpServletResponse response){

        startPage();
        List<HjyCommunityDto> list = communityService.queryList(hjyCommunity);

        //数据转换
        List<HjyCommunityExcelDto> excelDtoList = list.stream().map(hjyCommunityDto -> {
            HjyCommunityExcelDto excelDto = new HjyCommunityExcelDto();
            excelDto.setCommunityId(hjyCommunityDto.getCommunityId());
            excelDto.setCommunityName(hjyCommunityDto.getCommunityName());
            excelDto.setCommunityCode(hjyCommunityDto.getCommunityCode());
            excelDto.setCommunityProvinceName(hjyCommunityDto.getCommunityProvinceName());
            excelDto.setCommunityCityName(hjyCommunityDto.getCommunityCityName());
            excelDto.setCommunityTownName(hjyCommunityDto.getCommunityTownName());
            excelDto.setCreateTime(hjyCommunityDto.getCreateTime());
            excelDto.setRemark(hjyCommunityDto.getRemark());

            return excelDto;
        }).collect(Collectors.toList());

        ExcelUtils.exportExcel(excelDtoList,HjyCommunityExcelDto.class,"Community_Info.xls",response,
                new ExportParams("Communities","Community_Info"));

        return BaseResponse.success("导出小区信息到Excel成功!");
    }

    @GetMapping("/exportBuildingExcel")
    public BaseResponse exportExcel(HjyBuilding hjyBuilding, HttpServletResponse response){
        startPage();
        List<HjyBuildingDto>  lists = buildingService.queryList(hjyBuilding);


        // data conversion
        List<HjyBuildingExcelDto> excelDtos = lists.stream().map(
                hjyBuildingDto -> {
                    HjyBuildingExcelDto excelDto = new HjyBuildingExcelDto();
                    excelDto.setBuildingId(hjyBuildingDto.getBuildingId());
                    excelDto.setBuildingName(hjyBuildingDto.getBuildingName());
                    excelDto.setBuildingCode(hjyBuildingDto.getBuildingCode());
                    excelDto.setBuildingAcreage(hjyBuildingDto.getBuildingAcreage());
                    excelDto.setCommunityId(hjyBuildingDto.getCommunityId());
                    excelDto.setCommunityName(hjyBuildingDto.getCommunityName());
                    excelDto.setCreateTime(hjyBuildingDto.getCreateTime());
                    excelDto.setRemark(hjyBuildingDto.getRemark());
                    return excelDto;
                }).collect(Collectors.toList());

        ExcelUtils.exportExcel(excelDtos,HjyBuildingExcelDto.class,"Building_Info.xls",response,
                new ExportParams("Buildings","Building_Info"));


        return BaseResponse.success("export buildings excel successfully");


    }


}
