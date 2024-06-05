package com.msb.hjy_backend.web.controller.system;

import com.msb.hjy_backend.common.core.controller.BaseController;
import com.msb.hjy_backend.common.core.domain.BaseResponse;
import com.msb.hjy_backend.system.domain.SysDept;
import com.msb.hjy_backend.system.service.SysDeptService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/dept")
public class SysDeptController extends BaseController {
    @Resource
    private SysDeptService sysDeptService;

    @RequestMapping("/list")
    public BaseResponse selectDeptList(SysDept sysDept){
        List<SysDept> sysDeptList = sysDeptService.selectDeptList(sysDept);
        return BaseResponse.success(sysDeptList);
    }
}
