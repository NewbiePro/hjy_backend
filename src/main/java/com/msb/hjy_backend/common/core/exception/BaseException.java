package com.msb.hjy_backend.common.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    //错误码
    private String code;

    //错误消息
    private String defaultMessage;

    public BaseException(String code, String defaultMessage){
        super(defaultMessage);
        this.code = code;
        this.defaultMessage = defaultMessage;
    }
}
