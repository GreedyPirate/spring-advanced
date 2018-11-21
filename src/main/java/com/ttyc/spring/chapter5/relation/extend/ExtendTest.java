package com.ttyc.spring.chapter5.relation.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class ExtendTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml" );
        Car son = (Car) context.getBean("son" );
        Assert.isTrue(son.getName().equals("Bench" ), "can not extend" );
    }
}
