package com.msb.hjy_backend.system.service;

import com.msb.hjy_backend.system.domain.SysDept;

import java.util.List;

public interface SysDeptService {
    public List<SysDept> selectDeptList(SysDept sysDept);
}
