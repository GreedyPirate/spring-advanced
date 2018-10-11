package com.ttyc.spring.chapter6.properties.encrypt;

import com.ttyc.spring.chapter6.properties.DataBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class EncryptTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter6/spring.xml");
        DataBase dataBase = (DataBase) context.getBean("encryptDataBase");
        Assert.isTrue(dataBase.getPassword().equals("ed0a75eeb69b34ddc14beed2678bee12"), "encrypt failed");
    }
}
