package com.gribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 为服务发现提供数据的支持
 * @author chendom
 * @date 2017/11/28 13:41
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RibbonServerApplication {
public static void main(String[] args){
    SpringApplication.run(RibbonServerApplication.class,args);
}
}
