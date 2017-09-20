package com.xiaoluo.designpattern.factory_method;

/**
 * 抽象工厂
 *
 * author: xiaoluo
 * date: 2017/9/18 10:13
 */
public abstract class CarFactory {
    public abstract Car createCar();

    // 反射获取类
//    public abstract <T extends Car> T createCar(Class<T> clz);
}
