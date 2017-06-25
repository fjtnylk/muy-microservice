package com.muy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/6/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqHelloApplicationTest {

    @Resource
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}
