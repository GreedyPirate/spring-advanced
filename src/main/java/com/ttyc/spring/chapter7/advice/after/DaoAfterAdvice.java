package com.ttyc.spring.chapter7.advice.after;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class DaoAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("sql execute completed");
    }
}
