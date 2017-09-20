package com.xiaoluo.designpattern.decorator;

/**
 * author: xiaoluo
 * date: 2017/9/18 15:17
 */
public abstract class Person {
    protected String name = "";

    // 自定义所需方法
    public abstract void wear(String clothes);
}
