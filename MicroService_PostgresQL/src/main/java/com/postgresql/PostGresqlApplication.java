package com.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-04-10
 * Time: 14:12
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PostGresqlApplication {
@Bean
@LoadBalanced
public RestTemplate restTemplate(){
    return new RestTemplate();
}
    public static void main(String[] args) {
        SpringApplication.run(PostGresqlApplication.class,args);
    }
}
