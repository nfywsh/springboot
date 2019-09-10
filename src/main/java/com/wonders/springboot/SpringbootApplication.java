package com.wonders.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("SpringbootApplication1");
        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println("SpringbootApplication2");
    }

}
