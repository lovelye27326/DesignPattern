package com.xiaoluo.designpattern.abstract_factory;

/**
 * author: xiaoluo
 * date: 2017/9/18 11:13
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
