package com.ttyc.spring.chapter4.lifecycle;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        ConfigurableListableBeanFactory beanFactory = ((AnnotationConfigApplicationContext) context).getBeanFactory();
        Car car = (Car) context.getBean("car" );
        System.out.println(car.getName());
        System.out.println(car.getBeanName());
        ((AnnotationConfigApplicationContext) context).close();
    }
}
