package com.ttyc.spring.chapter8.execution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Order(2)
@Configuration
public class ExecutionAspect {

    @Pointcut("execution(* com.ttyc.spring.chapter8.service..*.*(..))")
    public void before() {
    }

    @Pointcut("@annotation(com.ttyc.spring.chapter8.execution.Skip)")
    public void after() {
    }

    @Pointcut("execution(public * com.ttyc.spring.chapter8.service.UserService+.*(..))")
    public void sub() {}

    @Before(value = "ExecutionAspect.before() || sub()", argNames = "joinPoint")
    public void beforeAdvice(JoinPoint joinPoint) throws NoSuchMethodException {
        Object[] args = joinPoint.getArgs();

        // 被代理类的信息
        Signature signature = joinPoint.getSignature();
        Class declaringType = signature.getDeclaringType();
        String declaringTypeName = signature.getDeclaringTypeName();
        int modifiers = signature.getModifiers();
        String name = signature.getName(); // 被增强的方法

        Method method = declaringType.getMethod(name, Integer.class);

        Object target = joinPoint.getTarget(); // 被代理的对象
        Object proxy = joinPoint.getThis(); // 生产的代理类本身
        System.out.println("before method invoke, args are: " + Arrays.toString(args));
    }


    @After("after()")
    public void afterAdvice() {
        System.out.println("after Skiped method invoke" );
    }

    // pointcut可以覆盖value，即切点
    @AfterReturning(value = "before()", returning = "ret")
    public void afterReturn(ProceedingJoinPoint point, Object ret) {
        //ProceedingJoinPoint继承了JoinPoint，提供执行方法
    }
}
