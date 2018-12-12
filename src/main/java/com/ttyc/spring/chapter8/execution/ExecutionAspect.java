package com.ttyc.spring.chapter8.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
@Configuration
public class ExecutionAspect {

    @Pointcut("execution(* com.ttyc.spring.chapter8.service..*.*(..))")
    public void before() {
    }

    @Before("before()" )
    public void beforeAdvice() {
        System.out.println("before method invoke" );
    }
}
