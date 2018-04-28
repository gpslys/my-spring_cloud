package com.yiche.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by root on 2018/4/23.
 */
@FeignClient(value = "eurekaClient",fallback =MyFailService.class)
public interface EurekaFeignService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
//    @RequestParam 如果客户端有参数，在这里指定参数名不可少，否则就找不到
    public String getHello(@RequestParam(value = "name") String name);
}
