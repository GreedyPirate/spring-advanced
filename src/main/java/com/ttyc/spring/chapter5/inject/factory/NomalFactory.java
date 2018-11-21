package com.ttyc.spring.chapter5.inject.factory;

public class NomalFactory {

    public Car createCar() {
        return new Car("mosi", "black" );
    }
}
