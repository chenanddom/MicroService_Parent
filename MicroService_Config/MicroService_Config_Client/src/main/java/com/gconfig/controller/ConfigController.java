package com.gconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${message}")
    String message ;
    @RequestMapping(value = "/hi")
    public String hi(){
        return message;
    }
}
