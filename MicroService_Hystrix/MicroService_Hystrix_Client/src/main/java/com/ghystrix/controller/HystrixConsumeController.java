package com.ghystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixConsumeController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/comsume/getInfo")
    @HystrixCommand(fallbackMethod = "getInformationFallback")
    public String getInformation(){
       String content = restTemplate.postForObject("http://Hystrix-Server/information/getInfo",null,String.class);
    return "".equals(content)?"":content;
}

    public String getInformationFallback() {
        return "无法请求该接口";
    }
}
