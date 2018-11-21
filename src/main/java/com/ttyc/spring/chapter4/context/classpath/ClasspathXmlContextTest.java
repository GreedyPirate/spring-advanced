package com.ttyc.spring.chapter4.context.classpath;

import com.ttyc.spring.chapter4.context.annotation.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasspathXmlContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter4/spring.xml" );
        Car mtw = (Car) context.getBean("mtw" );
        System.out.println(mtw.getColor());
    }
}
