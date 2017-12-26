package com.gfeignclient.controller;

import com.gfeignclient.service.FeignClientService;
import org.springframework.web.bind.annotation.RequestMapping;

public class FeiClientController implements FeignClientService {
    @Override
    @RequestMapping("/getInfo")
    public String getAllInformation() {
        return "this is information";
    }
}
