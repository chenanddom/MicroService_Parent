package com.gribbon.controller;

import com.gribbon.service.FeignServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendom
 * @date 2017/11/28 13:45
 */
@RestController
@RequestMapping("/provider")
public class DataProviderController implements FeignServices {
    @RequestMapping("/getData")
    public String getData(){
    return "how old are you";
}

    @Override
    @RequestMapping("/getConfigure")
    public String getConfig() {
        return "this is configuration";
    }
}
