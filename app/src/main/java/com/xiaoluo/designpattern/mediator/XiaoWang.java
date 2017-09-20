package com.xiaoluo.designpattern.mediator;

/**
 * author: xiaoluo
 * date: 2017/9/20 10:57
 */
public class XiaoWang extends APerson {
    public XiaoWang(Mediator mediator) {
        super(mediator);
    }

    public void query() {
        System.out.println("小王向中介询问房子");
        mediator.operate(this);
    }

    public void getPrice() {
        System.out.println("中介告知小王价格");
    }
}
