package com.gfeignclient.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface FeignClientService {
    @RequestMapping("/getInfo")
    String getAllInformation();

}
