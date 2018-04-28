package com.yiche.controller;

import com.yiche.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2018/4/20.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String testHello(@RequestParam String name) {
        return helloService.hiServive(name);
    }
}
