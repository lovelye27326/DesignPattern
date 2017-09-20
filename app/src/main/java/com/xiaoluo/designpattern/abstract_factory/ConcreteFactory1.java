package com.xiaoluo.designpattern.abstract_factory;

/**
 * author: xiaoluo
 * date: 2017/9/18 11:12
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
