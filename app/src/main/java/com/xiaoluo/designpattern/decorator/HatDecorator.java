package com.xiaoluo.designpattern.decorator;

/**
 * author: xiaoluo
 * date: 2017/9/18 15:25
 */
public class HatDecorator extends Person {
    Person person;

    public HatDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void wear(String clothes) {
        person.wear(clothes);
    }
}
