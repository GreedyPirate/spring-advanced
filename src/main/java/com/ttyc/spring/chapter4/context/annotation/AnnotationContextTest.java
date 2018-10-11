package com.ttyc.spring.chapter4.context.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jaynnay
 * @createTime 2018/9/13 23:45
 * @description 使用Java config，用AnnotationConfigApplicationContext上下文加载
 */
public class AnnotationContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Car car = (Car) context.getBean("car");
        System.out.println(car.getColor());
    }
}
