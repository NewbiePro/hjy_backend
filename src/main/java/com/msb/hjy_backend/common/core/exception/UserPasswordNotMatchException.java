package com.msb.hjy_backend.common.core.exception;

/**
 * 用户密码不正确异常类
 *
 **/
public class UserPasswordNotMatchException extends CustomException {

    public UserPasswordNotMatchException() {
        super(400,"用户不存在/密码错误");
    }
}
