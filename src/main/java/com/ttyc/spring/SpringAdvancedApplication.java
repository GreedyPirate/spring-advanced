package com.ttyc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.support.RequestHandledEvent;

@SpringBootApplication
public class SpringAdvancedApplication {

    public static void main(String[] args) {

//        SpringApplication.run(SpringAdvancedApplication.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(SpringAdvancedApplication.class, args);
        ApplicationListener<RequestHandledEvent> requestListener = (ApplicationListener<RequestHandledEvent>) context.getBean("requestListener");
        context.addApplicationListener(requestListener);
    }
}
