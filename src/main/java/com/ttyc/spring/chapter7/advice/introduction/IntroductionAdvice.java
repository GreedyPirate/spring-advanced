package com.ttyc.spring.chapter7.advice.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @author jaynnay
 * @createTime 2018/9/30 23:31
 * @description 引介增加，通过实现接口的方式增强
 */
public class IntroductionAdvice extends DelegatingIntroductionInterceptor implements DBMonitor {
    @Override
    public boolean needable() {
        return true;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        if (needable()) {
            System.out.println("need metric" );
        }
        return super.invoke(mi);
    }
}
