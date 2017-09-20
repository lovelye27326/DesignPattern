package com.xiaoluo.designpattern.proxy;

/**
 * author: xiaoluo
 * date: 2017/9/18 16:17
 */
public class Friend implements IOrderMeal {
    IOrderMeal person;

    public Friend(IOrderMeal person) {
        this.person = person;
    }

    @Override
    public void chooseFood() {
        person.chooseFood();
    }

    @Override
    public void pay() {
        person.pay();
    }
}
