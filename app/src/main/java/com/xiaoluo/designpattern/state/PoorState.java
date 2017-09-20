package com.xiaoluo.designpattern.state;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:09
 */
public class PoorState implements IState {
    @Override
    public void buy() {
        System.out.println("没钱,不买");
    }

    @Override
    public void eat() {
        System.out.println("没钱,不吃");
    }

    @Override
    public void play() {
        System.out.println("没钱,不玩");
    }
}
