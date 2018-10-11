package com.ttyc.spring.chapter7.advice.before;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class DaoBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method name is " + method + ", args are " + Arrays.toString(args));
    }
}
