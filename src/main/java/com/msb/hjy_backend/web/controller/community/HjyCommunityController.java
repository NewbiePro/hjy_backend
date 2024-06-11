package com.msb.hjy_backend.web.controller.community;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjy_backend.common.constant.HttpStatus;
import com.msb.hjy_backend.common.core.controller.BaseController;
import com.msb.hjy_backend.common.core.domain.BaseResponse;
import com.msb.hjy_backend.common.core.page.PageResult;
import com.msb.hjy_backend.common.utils.ServletUtils;
import com.msb.hjy_backend.community.domain.HjyCommunity;
import com.msb.hjy_backend.community.domain.dto.HjyCommunityDto;
import com.msb.hjy_backend.community.domain.vo.HjyCommunityVo;
import com.msb.hjy_backend.community.service.HjyCommunityService;
import com.msb.hjy_backend.community.service.impl.HjyCommunityServiceImpl;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/community")
@Slf4j
public class HjyCommunityController extends BaseController {
    @Resource
    private HjyCommunityService hjyCommunityService;

    /**
     * 多条件分页查询
     * @param hjyCommunity
     * @return
     */
    @GetMapping("/list")
    @PreAuthorize("@pe.hasPerms('system:community:list')")
    public PageResult list(HjyCommunity hjyCommunity){
        //封装调用pageHelper的startpage方法
        startPage();
        //得到数据
        List<HjyCommunityDto> list = hjyCommunityService.queryList(hjyCommunity);
        //封装数据
        return getData(list);
    }
    // 新增小区
    @PostMapping
    public BaseResponse add(@RequestBody HjyCommunity hjyCommunity){
        return toAjax(hjyCommunityService.insertHjyCommunity(hjyCommunity));
    }

    @GetMapping("/{communityId}")
    public BaseResponse getInfo(@PathVariable("communityId") Long communityId){
        return BaseResponse.success(hjyCommunityService.selectHjyCommunityById(communityId));
    }

    /**
     * 修改小区
     * @param hjyCommunity
     * @return
     */
    @PutMapping
    public BaseResponse edit(@RequestBody HjyCommunity hjyCommunity){
        return toAjax(hjyCommunityService.updateHjyCommunity(hjyCommunity));
    }

    /**
     * 根据id删除数据
     * @param communityIds
     * @return
     */
    @DeleteMapping("/{communityIds}")
    public BaseResponse delete(@PathVariable Long[] communityIds){
        return toAjax(hjyCommunityService.deleteHjyCommunity(communityIds));

    }

    // 小区下拉列表
    @GetMapping("/queryPullDown")
    public BaseResponse queryPullDown(HjyCommunity hjyCommunity){

        //打印入参日志
        log.info("log() called with parameters => [hjyCommunity = {}]",hjyCommunity);
        System.out.println(hjyCommunity);

        List<HjyCommunityVo> voList = null;
        try {
            voList = hjyCommunityService.queryPullDown(hjyCommunity);
        } catch (Exception e) {
            //e.printStackTrace();
            log.warn("获取小区下拉列表失败!",e);
        }

        //打印日志 返回结果
        log.info("log() returned: {} ",voList);
        return BaseResponse.success(voList);
    }


}
