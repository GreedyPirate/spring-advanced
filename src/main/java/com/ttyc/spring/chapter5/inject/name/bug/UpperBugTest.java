package com.ttyc.spring.chapter5.inject.name.bug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 没有出现命名规范bug：cPU
 */
public class UpperBugTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter5/spring.xml" );
        UpperCase upper = (UpperCase) context.getBean("upper" );
        System.out.println(upper.getCPU());
    }
}
