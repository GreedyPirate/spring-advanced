package com.ttyc.spring.chapter8.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
@Configuration
public class AnnotationAspect {
    @Pointcut("@annotation(com.ttyc.spring.chapter8.annotation.Skip)")
    public void before() {
    }

    @Before("before()" )
    public void beforeAdvice() {
        System.out.println("before Skiped method invoke" );
    }
}
