package com.aaa.springcloudproductb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient

@SpringBootApplication
public class SpringcloudProductbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProductbApplication.class, args);
    }

}
