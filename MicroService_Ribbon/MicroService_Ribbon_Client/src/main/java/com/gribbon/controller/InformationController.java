package com.gribbon.controller;
import com.gribbon.client.FeignTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chendom
 * @date 2017/11/28 13:48
 */
@RestController
@RequestMapping("/information")
public class InformationController {
    @Autowired
    private FeignTestClient feignTestClient;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getInfo")
    public String getInformation(){

        return restTemplate.postForObject("http://MicroService_Ribbon_Server/provider//getConfigure",null,String.class);
        }
    @RequestMapping("/getConfiguration")
    public String FeiClientTest(){
        String string = feignTestClient.getConfig();
        return string;
    }
}
