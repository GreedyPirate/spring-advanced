package com.ttyc.spring.chapter6.i18n.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import java.util.Locale;

public class ApplicationContextI18nTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter6/spring.xml" );
        String name = context.getMessage("name", null, Locale.CHINA);
        Assert.isTrue(name.equals("紫夜" ), "error name" );
    }
}
