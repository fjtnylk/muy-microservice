package com.muy.controller;

import com.muy.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yanglikai on 2017/6/19.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "Hello world";
    }

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public String index(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public User index(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/index3", method = RequestMethod.POST)
    public String index(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
