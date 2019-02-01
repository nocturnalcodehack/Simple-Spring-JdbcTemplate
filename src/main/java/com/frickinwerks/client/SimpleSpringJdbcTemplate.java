package com.frickinwerks.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages= "com.frickinwerks")
public class SimpleSpringJdbcTemplate {

    public static void main(String[] args) {

        SpringApplication.run(SimpleSpringJdbcTemplate.class, args);
    }
}
