package com.msb.hjy_backend.common.core.exception;

/**
 * 验证码异常类
 */
public class CaptchaNotMatchException extends CustomException {

    public CaptchaNotMatchException() {
        super(400,"验证码错误");
    }
}
