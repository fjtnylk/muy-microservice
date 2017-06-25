package com.muy;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yanglikai on 2017/6/25.
 */
@Component
public class Sender {

    @Resource
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();

        System.out.println("Sender :" + context);

        this.amqpTemplate.convertAndSend("hello", context);
    }
}
