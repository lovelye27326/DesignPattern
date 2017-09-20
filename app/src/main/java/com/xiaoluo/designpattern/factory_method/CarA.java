package com.xiaoluo.designpattern.factory_method;

/**
 * 实际产品A
 */
public class CarA extends Car{

    @Override
    public void drive() {
        System.out.println("这是CarA");
    }
}
