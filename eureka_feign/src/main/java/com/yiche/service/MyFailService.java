package com.yiche.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by root on 2018/4/23.
 */
@Component
public class MyFailService implements EurekaFeignService{

    @Override
    public String getHello(String name) {
        return "sorry "+name;
    }
}
