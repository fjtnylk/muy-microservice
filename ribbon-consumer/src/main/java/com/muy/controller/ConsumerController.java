package com.muy.controller;

import com.muy.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/6/19.
 */
@RestController
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String index() {
        return consumerService.helloService();
    }
}
