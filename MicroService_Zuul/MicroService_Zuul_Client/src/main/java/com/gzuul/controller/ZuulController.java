package com.gzuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {
    @RequestMapping("/information/getInfo")
    public String getInformation() {
        return "this is information";
    }
}
