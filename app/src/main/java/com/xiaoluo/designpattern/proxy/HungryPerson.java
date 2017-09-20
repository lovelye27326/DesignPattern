package com.xiaoluo.designpattern.proxy;

/**
 * 实际
 * author: xiaoluo
 * date: 2017/9/18 16:16
 */
public class HungryPerson implements IOrderMeal {
    @Override
    public void chooseFood() {
        System.out.println("订个鸡腿饭吧");
    }

    @Override
    public void pay() {
        System.out.println("付款");
    }
}
