package com.muy.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/6/19.
 */
@Service
public class ConsumerService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://service-provider/index", String.class).getBody();
    }

    private String helloFallback() {
        return "error";
    }
}
