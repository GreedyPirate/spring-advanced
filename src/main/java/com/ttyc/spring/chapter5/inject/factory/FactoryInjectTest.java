package com.ttyc.spring.chapter5.inject.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryInjectTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml");
        // 返回值和静态工厂方法的返回类型一样，都是bean
        Car car = (Car) context.getBean("staticCar");
    }

}
