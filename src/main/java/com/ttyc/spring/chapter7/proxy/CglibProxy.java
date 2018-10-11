package com.ttyc.spring.chapter7.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    // 创建父类的子类代理对象
    public Object getProxy(Class c){
        enhancer.setSuperclass(c);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    // 代理过程
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        StopWatch stopWatch = new StopWatch("cglib proxy test:");
        stopWatch.start(method.getName());
        TimeUnit.SECONDS.sleep(1);

        Object result = methodProxy.invokeSuper(o, args);

        stopWatch.stop();
        String s = stopWatch.prettyPrint();
        System.out.println(s);
        return result;
    }
}
