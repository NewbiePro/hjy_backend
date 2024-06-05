package com.msb.hjy_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;


@SpringBootApplication
@MapperScan("com.msb.hjy_backend.**.mapper")
public class HjyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HjyBackendApplication.class, args);
        System.out.println("启动成功");
    }

}
