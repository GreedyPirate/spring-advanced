package com.ttyc.spring.chapter6.editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class CustomerEditorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter6/spring.xml" );
        Boss boss = (Boss) context.getBean("boss" );
        Car car = boss.getCar();

        Assert.isTrue(car.getName().equals("btw" ) && car.getColor().equals("red" ), "failed" );

    }
}
