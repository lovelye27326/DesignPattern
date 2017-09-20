package com.xiaoluo.designpattern.decorator;

/**
 * author: xiaoluo
 * date: 2017/9/18 15:22
 */
public class TshirtDecorator extends Person {
    Person person;

    public TshirtDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void wear(String clothes) {
        person.wear(clothes);
    }
}
