package com.xiaoluo.designpattern.factory_method;

/**
 * author: xiaoluo
 * date: 2017/9/18 10:15
 */
public class CarFactoryB extends CarFactory {
    @Override
    public CarB createCar() {
        return new CarB();
    }
}
