package com.ttyc.spring.chapter8.execution;

import com.ttyc.spring.chapter8.service.SuperUserServiceImpl;
import com.ttyc.spring.chapter8.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class ExecutionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter8/spring.xml" );
        UserService userService = (UserService) context.getBean("userService" );
        String ret = userService.login(1);

        userService.save("jay");
        Assert.state(ret.equals("SUCCESS" ), "failed" );

        // JDK产生的是UserService的子类，那么它和SuperUserServiceImpl是平级的
        // error SuperUserServiceImpl superUserService = (SuperUserServiceImpl) context.getBean("superUserService" );
    }
}
