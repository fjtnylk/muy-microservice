package com.muy;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yanglikai on 2017/6/25.
 */
@Configuration
public class RabbitConfig {

    public Queue helloQueue() {
        return new Queue("hello");
    }
}
