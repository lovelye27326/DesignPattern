package com.xiaoluo.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 *
 * author: xiaoluo
 * date: 2017/9/19 14:43
 */
public class People implements Observer {
    String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到更新!");
    }
}
