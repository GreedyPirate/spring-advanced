package com.ttyc.spring.chapter7.proxy;

import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class JDKProxy implements InvocationHandler {

    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StopWatch stopWatch = new StopWatch("jdk proxy test:" );
        stopWatch.start(method.getName());
        TimeUnit.SECONDS.sleep(1);

        Object result = method.invoke(target, args);

        stopWatch.stop();
        String s = stopWatch.prettyPrint();
        System.out.println(s);
        return result;
    }
}
