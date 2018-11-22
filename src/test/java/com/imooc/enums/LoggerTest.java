package com.imooc.enums;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gexiao
 * @date 2018/11/21 下午 08:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

  //  private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        String name = "hehe";
        String password = "password";
        log.debug("debug....");
        log.info("info....{},password{}",name,password);
        log.error("error....");
        log.warn("warn....");
    }
}
