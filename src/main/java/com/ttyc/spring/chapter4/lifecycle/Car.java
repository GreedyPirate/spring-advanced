package com.ttyc.spring.chapter4.lifecycle;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Data
public class Car implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;
    private String color;

    BeanFactory beanFactory;
    String beanName;
    ApplicationContext applicationContext;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destory" );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after all properties seted" );
    }

    public void init() {
        System.out.println("init - method" );
    }

    public void close() {
        System.out.println("destroy - method" );
    }


    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}