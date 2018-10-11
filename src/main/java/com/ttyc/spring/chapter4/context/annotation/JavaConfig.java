package com.ttyc.spring.chapter4.context.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    Car car(){
        return new Car("bmw","red");
    }
}

