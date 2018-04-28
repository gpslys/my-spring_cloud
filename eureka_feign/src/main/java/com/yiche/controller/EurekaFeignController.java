package com.yiche.controller;

import com.yiche.service.EurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2018/4/23.
 */
@RestController
public class EurekaFeignController {
    @Autowired
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/index")
    public String test(){
        return eurekaFeignService.getHello("feign");
    }
}
