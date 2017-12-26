package com.gfeignclient.controller;

import com.gfeignclient.client.InformationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendom
 * @date 2017/11/30 10:38
 */
@RestController
public class FeiClientController {
    @Autowired
    InformationClient informationClient;
    @RequestMapping("/test/getData")
    public String getData(){
    return informationClient.getAllInformation();
}

}
