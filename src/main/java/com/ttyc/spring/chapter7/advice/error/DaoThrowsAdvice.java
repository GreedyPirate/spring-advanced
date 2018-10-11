package com.ttyc.spring.chapter7.advice.error;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class DaoThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("exception message is " + ex.getMessage());
    }
}
