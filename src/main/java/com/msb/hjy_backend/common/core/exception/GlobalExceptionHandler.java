package com.msb.hjy_backend.common.core.exception;

import com.msb.hjy_backend.common.core.domain.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 全局异常处理器
@RestControllerAdvice //切面操作
public class GlobalExceptionHandler {
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse baseExceptionHandler(BaseException baseException){
        return BaseResponse.fail(baseException.getDefaultMessage());
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public BaseResponse businessException(CustomException customException){
        return BaseResponse.fail(customException.getCode()+"", customException.getMsg(), customException.isSuccess());
    }
}
