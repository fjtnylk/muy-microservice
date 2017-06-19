package com.muy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanglikai on 2017/6/19.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "Hello world";
    }
}
