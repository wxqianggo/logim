package com.example.logim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LogimApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogimApplication.class, args);
    }

}
