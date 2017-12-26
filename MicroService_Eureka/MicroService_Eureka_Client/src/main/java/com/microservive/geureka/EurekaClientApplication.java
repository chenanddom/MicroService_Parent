package com.microservive.geureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chendom
 * @date 2017/11/28 9:18
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class EurekaClientApplication {
public static void main(String[] args){
    SpringApplication.run(EurekaClientApplication.class,args);
}
}
