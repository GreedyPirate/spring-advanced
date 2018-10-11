package com.ttyc.spring.chapter6.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

@Component("requestListener")
public class RequestListener implements ApplicationListener<ServletRequestHandledEvent>{

    @Override
    public void onApplicationEvent(ServletRequestHandledEvent event) {
        System.out.println(event.getDescription());
    }
}
