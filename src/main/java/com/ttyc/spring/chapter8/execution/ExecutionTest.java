package com.ttyc.spring.chapter8.execution;

import com.ttyc.spring.chapter8.sevice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class ExecutionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter8/spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        String ret = userService.login(1);
        Assert.state(ret.equals("SUCCESS"),"failed");
    }
}
