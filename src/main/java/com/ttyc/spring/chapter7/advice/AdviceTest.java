package com.ttyc.spring.chapter7.advice;

import com.ttyc.spring.chapter7.proxy.helper.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class AdviceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter7/spring.xml");
        UserDao userDao = (UserDao) context.getBean("proxyFactory");
        userDao.getName();
        Assert.isTrue(userDao.getClass().getSimpleName().contains("CGLIB"), "代理类不是CGLIB产生");
    }
}
