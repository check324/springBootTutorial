package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.infotech.controller")
public class SpringBootDefaultCustomErrorPageDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDefaultCustomErrorPageDemoApplication.class, args);
    }
}
