package com.msb.hjy_backend.web.controller.system;

import com.msb.hjy_backend.common.core.controller.BaseController;
import com.msb.hjy_backend.common.core.domain.BaseResponse;
import com.msb.hjy_backend.system.service.SysAreaService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/area")
public class SysAreaController extends BaseController {

    @Resource
    private SysAreaService sysAreaService;

    @RequestMapping("/tree")
    public BaseResponse getAreaTree(){
        return BaseResponse.success(sysAreaService.findAeraAsTree());
    }
}
