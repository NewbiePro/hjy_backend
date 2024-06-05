package com.msb.hjy_backend.system.service.impl;

import com.msb.hjy_backend.system.domain.SysDept;
import com.msb.hjy_backend.system.mapper.SysDeptMapper;
import com.msb.hjy_backend.system.service.SysDeptService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    // 查询部门管理的数据
    @Override
    public List<SysDept> selectDeptList(SysDept sysDept) {
        return sysDeptMapper.selectDeptList(sysDept);

    }
}
