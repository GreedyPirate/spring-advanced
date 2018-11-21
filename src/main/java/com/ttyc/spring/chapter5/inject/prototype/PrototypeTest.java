package com.ttyc.spring.chapter5.inject.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author jaynnay
 * @createTime 2018/9/17 22:59
 * @description 一个老板有很多辆车
 * Boss 单例， 车 多例
 * 每次new同一个Boss，但是返回不同的车
 * <p>
 * Spring 提供lookup-method机制，通过CGlib动态代理
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml" );
        MultiCar bigBoss = (MultiCar) context.getBean("bigBoss" );
        Car car1 = bigBoss.getCar();
        Car car2 = bigBoss.getCar();

        Assert.isTrue(car1 != car2, "Car1 != Car2, cause it's prototype" );

        // 无聊
        Poor poor = (Poor) context.getBean("poor" );
        Assert.isTrue("oneCar".equals(poor.getCar()), "failed" );
    }
}
