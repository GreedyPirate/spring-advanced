package com.ttyc.spring.chapter8.annotation;

import com.ttyc.spring.chapter8.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter8/spring.xml" );
        UserService userService = (UserService) context.getBean("userService" );
        String ret = userService.login(2);
        Assert.state(ret.equals("SUCCESS" ), "failed" );
    }
}
