package com.msb.hjy_backend.web.test;

import com.msb.hjy_backend.common.core.domain.BaseResponse;
import com.msb.hjy_backend.common.core.exception.BaseException;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/queryUserById")
    public BaseResponse<User> queryUserById(String userId){
        System.out.println(userId);
        if(userId != null){
            return BaseResponse.success(new User(userId,"shit"));
        }else{
            return BaseResponse.fail("查询用户失败");
        }
    }

    @RequestMapping("/addUser")
    public BaseResponse<String> addUser(@Validated User user, BindingResult bindingResult){
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        System.out.println(bindingResult.hasErrors());
        System.out.println(fieldErrors);
        //如果参数校验失败了，会将错误信息封装成对象 封装到 BindingResult
        System.out.println(fieldErrors.isEmpty());
        if(!fieldErrors.isEmpty()){
            return BaseResponse.fail(fieldErrors.get(0).getDefaultMessage());
        }
        return BaseResponse.success("ok");
    }

    @RequestMapping("/queryUser")
    public BaseResponse queryUser(User user){
        throw new BaseException("500","测试异常类");
    }
}
