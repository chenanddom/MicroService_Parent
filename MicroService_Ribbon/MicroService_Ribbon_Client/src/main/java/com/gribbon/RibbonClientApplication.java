package com.gribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author chendom
 * @date 2017/11/28 10:16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RibbonClientApplication {
    @LoadBalanced//实现负载均衡
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
public static void main(String[] args){
    SpringApplication.run(RibbonClientApplication.class,args);
}
}
