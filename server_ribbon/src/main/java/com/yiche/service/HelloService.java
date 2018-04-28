package com.yiche.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.hystrix.FallbackHandler;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import java.util.Map;

/**
 * Created by root on 2018/4/20.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "errorMethod")
    public String hiServive(String name){
        return restTemplate.getForObject("http://eurekaClient/index?name="+name,String.class);
    }
    public String errorMethod(String name){
        return "hi "+name+"此路不通";
    }
}