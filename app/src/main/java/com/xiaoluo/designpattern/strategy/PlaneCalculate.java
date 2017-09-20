package com.xiaoluo.designpattern.strategy;

/**
 * author: xiaoluo
 * date: 2017/9/19 11:31
 */
public class PlaneCalculate implements ICalculate {

    @Override
    public String name() {
        return "plane";
    }

    @Override
    public int cost() {
        return 1000;
    }
}
