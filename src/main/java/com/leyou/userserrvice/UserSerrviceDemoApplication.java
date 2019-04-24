package com.leyou.userserrvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class UserSerrviceDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserSerrviceDemoApplication.class, args);
    }
}