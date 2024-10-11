package com.tamoe.fraudd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrauddApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrauddApplication.class, args);
    }

}