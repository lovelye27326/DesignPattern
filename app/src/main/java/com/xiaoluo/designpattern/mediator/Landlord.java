package com.xiaoluo.designpattern.mediator;

/**
 * author: xiaoluo
 * date: 2017/9/20 10:57
 */
public class Landlord extends APerson {
    public Landlord(Mediator mediator) {
        super(mediator);
    }

    public void tell() {
        System.out.println("房东告诉中介价格");
        mediator.operate(this);
    }

    public void getInfo() {
        System.out.println("中介告诉房东有人来问房了");
    }
}
