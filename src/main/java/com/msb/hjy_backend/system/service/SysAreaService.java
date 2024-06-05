package com.msb.hjy_backend.system.service;

import com.msb.hjy_backend.system.domain.dto.SysAreaDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysAreaService {

    // 获取区域数据的完整树
    List<SysAreaDto> findAeraAsTree();
}
