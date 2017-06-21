package com.muy.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by yanglikai on 2017/6/20.
 */
@FeignClient(name = "service-provider")
public interface RefactorHelloService extends com.muy.service.didi.HelloService {
}
