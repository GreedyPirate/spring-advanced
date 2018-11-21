package com.ttyc.spring.chapter5.inject.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class NameTest {
    public static void main(String[] args) {
        // 多个name
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml" );
        Car mosi = (Car) context.getBean("mosi" );
        System.out.println(mosi.getName());

        // 类全名
        Student student = (Student) context.getBean("com.ttyc.spring.chapter5.inject.name.Student" );
        Assert.notNull(student, "get bean failed" );
    }
}
