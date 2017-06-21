package com.muy.controller;

import com.muy.dto.didi.User;
import com.muy.service.didi.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanglikai on 2017/6/20.
 */
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
