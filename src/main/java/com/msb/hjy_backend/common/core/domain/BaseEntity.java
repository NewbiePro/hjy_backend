package com.msb.hjy_backend.common.core.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Data
public class BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -4452856995464107402L;
    // 搜索值
    @TableField(exist = false) //不属于数据库字段.mybatis在新增的时候会忽略
    private String searchValue;

    // 请求参数
    @TableField(exist = false)
    private Map<String, Object> params;

    //创建者
    @TableField(fill = FieldFill.INSERT) //表明在什么时候需要被填充
    private String createBy;

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    //更新者
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date updateTime;

    //备注
    private String remark;

}
