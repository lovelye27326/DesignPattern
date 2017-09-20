package com.xiaoluo.designpattern.factory_method;

/**
 * author: xiaoluo
 * date: 2017/9/18 10:15
 */
public class CarFactoryA extends CarFactory {
    @Override
    public CarA createCar() {
        return new CarA();
    }

    // 反射获取类
//    @Override
//    public <T extends Car> T createCar(Class<T> clz) {
//        Car car = null;
//        try {
//            car = (Car) Class.forName(clz.getName()).newInstance();
//        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return (T) car;
//    }
}
