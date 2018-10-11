package com.ttyc.spring.chapter5.relation.dependen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author jaynnay
 * @createTime 2018/9/17 23:22
 * @description 有时序要求的两个bean，形成依赖关系，bean1 必须在bean2之前初始化
 */
public class DependenTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml");
        Car second = (Car) context.getBean("second");
        Assert.notNull(second,"null object");
    }
}
