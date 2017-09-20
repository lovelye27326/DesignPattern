package com.xiaoluo.designpattern.flyweight;

/**
 * author: xiaoluo
 * date: 2017/9/19 10:27
 */
public class PhoneInfo implements IPhone {
    String phone;

    public PhoneInfo(String phone) {
        this.phone = phone;
    }

    @Override
    public void showInfo() {
        System.out.println("这是" + phone + "的信息");
    }
}
