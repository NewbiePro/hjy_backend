package com.msb.hjy_backend.common.core.page;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
// 分页查询统一响应封装
public class PageResult implements Serializable {
    @Serial
    private static final long serialVersionUID = 2129343293824431233L;

    // 总记录数
    private long total;

    //列表数据
    private List<?> rows;

    //消息状态码
    private Integer code;

    //消息内容
    private String msg;

    private PageResult(long total,List<?> rows){
        this.total = total;
        this.rows = rows;
    }
}
