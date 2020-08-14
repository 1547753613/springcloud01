package com.aaa.springcloudserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServer2Application.class, args);
    }

}
