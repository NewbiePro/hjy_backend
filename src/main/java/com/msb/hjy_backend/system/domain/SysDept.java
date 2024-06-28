package com.msb.hjy_backend.system.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.msb.hjy_backend.common.core.domain.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 部门表(SysDept)实体类
 *
 */

@Data
public class SysDept extends BaseEntity implements Serializable  {
    private static final long serialVersionUID = -62769440660988481L;
/**
     * 部门id
     */
    @TableId
    private Long deptId;
/**
     * 父部门id
     */
    private Long parentId;

    /**
     * 父部门名称
     */
    private String parentName;

    /**
     * 子部门名称
     */
    private List<SysDept> children = new ArrayList<>();

    /**
     * 祖级列表
     */
    private String ancestors;
/**
     * 部门名称
     */
    private String deptName;
/**
     * 显示顺序
     */
    private Integer orderNum;
/**
     * 负责人
     */
    private String leader;
/**
     * 联系电话
     */
    private String phone;
/**
     * 邮箱
     */
    private String email;
/**
     * 部门状态（0正常 1停用）
     */
    private String status;
/**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;


}

