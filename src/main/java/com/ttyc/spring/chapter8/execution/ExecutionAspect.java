package com.ttyc.spring.chapter8.execution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAspect {

    @Pointcut("execution(public * com.ttyc.spring.chapter8.sevice.*..*(..))")
    public void before(){}

    @Before("before()")
    public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
        System.out.println("before method invoke");
    }
}
