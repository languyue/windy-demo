package com.windy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "guyuelan say Hello Windy, let's start go!";
    }
}
