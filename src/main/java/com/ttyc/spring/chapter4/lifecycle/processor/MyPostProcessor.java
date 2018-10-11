package com.ttyc.spring.chapter4.lifecycle.processor;

import com.ttyc.spring.chapter4.lifecycle.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("car")){
            Car car = (Car) bean;
            System.out.println("BeanPostProcessor Before bean Initialization : " + car.getBeanName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("car")){
            Car car = (Car) bean;
            System.out.println("BeanPostProcessor After bean Initialization : " + car.getBeanName());
        }
        return bean;
    }
}
