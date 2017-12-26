package com.ghystrix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixServerController {
    @RequestMapping("/information/getInfo")
    public String getInformation(){
    return "some information";
}
}
