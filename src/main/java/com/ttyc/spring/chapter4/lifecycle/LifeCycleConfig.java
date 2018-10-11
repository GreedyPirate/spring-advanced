package com.ttyc.spring.chapter4.lifecycle;

import com.ttyc.spring.chapter4.lifecycle.processor.MyPostProcessor;
import com.ttyc.spring.chapter4.lifecycle.processor.MyPostProcessorAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {
    @Bean(initMethod = "init", destroyMethod = "close")
    Car car() {
        return new Car("bench","red");
    }

    @Bean
    MyPostProcessor myPostProcessor(){
        return new MyPostProcessor();
    }

    @Bean
    MyPostProcessorAdapter myPostProcessorAdapter(){
        return new MyPostProcessorAdapter();
    }
}
