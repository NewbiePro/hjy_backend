package com.msb.hjy_backend.system.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 区域表(SysArea)实体类
 *
 * @author makejava
 * @since 2024-06-05 12:49:52
 */
@Data
public class SysArea implements Serializable {
    private static final long serialVersionUID = 868336809566683991L;
/**
     * 城市编码
     */
    private Integer code;
/**
     * 城市名称
     */
    private String name;
/**
     * 城市父ID
     */
    private Integer parentCode;


}

