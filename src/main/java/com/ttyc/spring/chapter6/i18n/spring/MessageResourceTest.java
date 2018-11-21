package com.ttyc.spring.chapter6.i18n.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import java.util.Locale;

public class MessageResourceTest {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter6/spring.xml" );
        MessageSource messageSource = (MessageSource) context.getBean("messageSource" );
        String name = messageSource.getMessage("name", null, Locale.CHINA);
        Assert.isTrue(name.equals("紫夜" ), "error name" );

        String enName = messageSource.getMessage("name", null, Locale.US);
        Assert.isTrue(enName.equals("jay" ), "error en name" );

        /*TimeUnit.SECONDS.sleep(10);
        enName = messageSource.getMessage("name", null, Locale.US);
        Assert.isTrue(!enName.equals("jay"), "error new en name");*/
    }
}
