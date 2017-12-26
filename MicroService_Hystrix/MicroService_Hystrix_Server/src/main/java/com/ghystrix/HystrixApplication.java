package com.ghystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker//标识允许断路器
public class HystrixApplication {
public static void main(String[] args){
    SpringApplication.run(HystrixApplication.class,args);
}
}
