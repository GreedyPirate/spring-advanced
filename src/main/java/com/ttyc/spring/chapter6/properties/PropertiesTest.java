package com.ttyc.spring.chapter6.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class PropertiesTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter6/spring.xml");
        DataBase dataBase = (DataBase) context.getBean("dataBase");
        Assert.isTrue(dataBase.getPort().equals(3306), "error port");
    }
}
