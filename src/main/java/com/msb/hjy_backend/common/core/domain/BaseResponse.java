package com.msb.hjy_backend.common.core.domain;

import lombok.Data;

import java.io.Serializable;

// 响应结果封装对象
@Data
public class BaseResponse<T> implements Serializable {


    private static final long serialVersionUID = 189328525545127188L;

    // 状态码
    // private String code;
    private int code;

    // 响应结果描述
    private String msg;

    // 返回的数据
    private T data;


    // 是否成功
    private boolean success;
    // 成功返回的方法
    public static <T> BaseResponse<T> success(T data){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(ResultCode.SUCCESS.getCode()));
        response.setMsg(ResultCode.SUCCESS.getMsg());
        response.setData(data);
        return response;
    }


    public static <T> BaseResponse<T> fail(String message){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(ResultCode.ERROR.getCode()));
        response.setMsg(message);
        return response;
    }
    //失败返回
    public static <T> BaseResponse<T> fail(String code, String message){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(code));
        response.setMsg(message);
        return response;
    }

    //失败返回 三个参数
    public static <T> BaseResponse<T> fail(String code, String message, boolean success){
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(code));
        response.setMsg(message);
        response.setSuccess(success);
        return response;
    }
}
