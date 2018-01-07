package com.glombok;

import com.glombok.model.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {
public static void main(String[] args){
    Message message = new Message();
    message.setMsgName("test");
   System.out.println(message.getMsgName());
    SpringApplication.run(LombokApplication.class,args);
}
}
