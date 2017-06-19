package com.muy.service;

import com.muy.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yanglikai on 2017/6/19.
 */
@FeignClient("service-provider")
public interface HelloService {

    @RequestMapping(value = "/index")
    String hello();

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/index3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
