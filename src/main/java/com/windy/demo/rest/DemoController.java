package com.windy.demo.rest;

import com.windy.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Test Hello Windy!";
    }

    @PostMapping("/message")
    public String sayName(@RequestBody User user) {
        return "hello " + user.getName();
    }
}
