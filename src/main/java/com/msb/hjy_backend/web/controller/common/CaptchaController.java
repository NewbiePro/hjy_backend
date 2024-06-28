package com.msb.hjy_backend.web.controller.common;

import com.msb.hjy_backend.common.constant.Constants;
import com.msb.hjy_backend.common.utils.ChainedMap;
import com.msb.hjy_backend.common.utils.UUIDUtils;
import com.wf.captcha.SpecCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.time.Duration;

/**
 * 获取验证码
 **/
@RestController
public class CaptchaController {


    // 当作数据库 存储作用
    @Autowired
    private RedisTemplate redisTemplate;



    @GetMapping("/captchaImage")
    public ChainedMap getCode(HttpServletResponse response){

        // 验证码
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);

        //生成验证码,以及验证码唯一标识
        String uuid = UUIDUtils.simpleUUID();

        //拼接redis的key - code
        String key = Constants.CAPTCHA_CODE_KEY + uuid;
        String code = specCaptcha.text().toLowerCase();

        //保存到redis
        redisTemplate.opsForValue().set(key,code, Duration.ofMinutes(100));

        return ChainedMap.create().set("uuid",uuid).set("img",specCaptcha.toBase64());
    }
}
