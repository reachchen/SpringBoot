package com.zjrealtech.trace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by admin on 2017/12/11.
 */
@SpringBootApplication
@EnableScheduling

@ComponentScan("com.zjrealtech.**")
@MapperScan("com.zjrealtech.trace.dao")
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}