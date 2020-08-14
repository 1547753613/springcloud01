package com.aaa.springcloudproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProductApplication.class, args);
    }

}
