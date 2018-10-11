package com.ttyc.spring.chapter5.inject.beanctl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author jaynnay
 * @createTime 2018/9/17 23:47
 * @description 控制bean的初始化过程，直接让bean实现FactoryBean接口
 */
public class FactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml");
        Car car = (Car) context.getBean("beanctl");
        Assert.isTrue(car.getName().contains("-"), "new failed");
    }
}
