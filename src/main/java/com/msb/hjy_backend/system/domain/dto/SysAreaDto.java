package com.msb.hjy_backend.system.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

// 层与层进行数据传输 - 区域数据传输对象 => dto 类 转化成Json 传回给前端
@Data
public class SysAreaDto implements Serializable {
    // 城市名称
    private Integer code;
    // 城市名称
    private String name;
    // 子区域
    private List<SysAreaDto> childrenSysArea;
}
