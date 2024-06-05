package com.msb.hjy_backend.common.core.domain;


import lombok.Getter;

/**
 * 响应状态码枚举类
 */
@Getter
public enum ResultCode {
    SUCCESS("200","操作成功"),
    ERROR("500","操作失败");

    // 自定义状态码
    private final String code;

    // 自定义描述
    private final String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
