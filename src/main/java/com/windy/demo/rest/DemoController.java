package com.windy.demo.rest;

import com.windy.demo.entity.ResponseModel;
import com.windy.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public ResponseModel hello() {
        return new ResponseModel("200", "success", "Test Hello Windy!");
    }

    @PostMapping("/message")
    public ResponseModel sayName(@RequestBody User user) {
        return new ResponseModel("200", "success", "Hello " + user.getName());
    }
}
