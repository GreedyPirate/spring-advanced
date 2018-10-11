package com.ttyc.spring.chapter5.inject.factory;

public class StaticCarFactory {

    public static Car createCar(){
        return new Car("mtw","red");
    }
}
