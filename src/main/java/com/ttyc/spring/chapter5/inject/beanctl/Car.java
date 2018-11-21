package com.ttyc.spring.chapter5.inject.beanctl;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StringUtils;

@Data
public class Car implements FactoryBean<Car> {
    String name;
    String color;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        if (!StringUtils.isEmpty(this.name)) {
            String name = this.name.replaceAll(",", "-" );
            car.setName(name);
        }
        car.setColor(color);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}