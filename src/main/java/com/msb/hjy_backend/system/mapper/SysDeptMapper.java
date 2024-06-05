package com.msb.hjy_backend.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.hjy_backend.system.domain.SysDept;

import java.util.List;

public interface SysDeptMapper extends BaseMapper<SysDept> {
    /**
     * 查询部门管理数据
     * @param sysDept
     * @return
     */
    List<SysDept> selectDeptList(SysDept sysDept);
}
