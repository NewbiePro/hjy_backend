package com.msb.hjy_backend.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogDemo {
    @Test
    public void test1(){
        Logger logger = LoggerFactory.getLogger(LogDemo.class);
        logger.info("Hello log-back");
    }

}
