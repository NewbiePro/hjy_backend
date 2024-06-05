package com.msb.hjy_backend.common.core.page;

import lombok.Data;

@Data
public class PageDomain {

    // 当前记录的起始索引
    private Integer pageNum;

    // 每页的记录数
    private Integer pageSize;
}
