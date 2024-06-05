package com.msb.hjy_backend.common.core.domain;

import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

// 响应结果封装对象
@Data
public class BaseResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 189328525545127188L;

    // 状态码
    private String code;

    // 响应结果描述
    private String message;

    // 返回的数据
    private T data;

    // 成功返回的方法
    public static <T> BaseResponse<T> success(T data){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMessage(ResultCode.SUCCESS.getMsg());
        response.setData(data);
        return response;
    }


    public static <T> BaseResponse<T> fail(String message){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(ResultCode.ERROR.getCode());
        response.setMessage(message);
        return response;
    }
    //失败返回
    public static <T> BaseResponse<T> fail(String code, String message){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }
}
