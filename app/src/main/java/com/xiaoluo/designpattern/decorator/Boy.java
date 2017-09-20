package com.xiaoluo.designpattern.decorator;

/**
 * author: xiaoluo
 * date: 2017/9/18 15:21
 */
public class Boy extends Person {
    public Boy() {
        name = "boy";
    }

    @Override
    public void wear(String clothes) {
        System.out.println(name + "穿了" + clothes);
    }
}
