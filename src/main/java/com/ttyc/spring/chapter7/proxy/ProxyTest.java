package com.ttyc.spring.chapter7.proxy;

import com.ttyc.spring.chapter7.proxy.helper.UserDao;
import com.ttyc.spring.chapter7.proxy.helper.UserDaoImpl;
import org.springframework.util.Assert;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        JDKProxy handler = new JDKProxy(userDao);

        UserDao proxyClass = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), handler);
        String name = proxyClass.getName();
        Assert.isTrue(name.equals("jay" ), "proxy failed" );


        CglibProxy cglibProxy = new CglibProxy();
        UserDaoImpl proxy = (UserDaoImpl) cglibProxy.getProxy(UserDaoImpl.class);
        System.out.println("代理类名：" + proxy.getClass().getSimpleName());
        name = proxy.getName();
        Assert.isTrue(name.equals("jay" ), "proxy failed" );
    }
}
