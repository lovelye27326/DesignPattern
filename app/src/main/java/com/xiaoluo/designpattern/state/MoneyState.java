package com.xiaoluo.designpattern.state;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:08
 */
public class MoneyState implements IState {
    @Override
    public void buy() {
        System.out.println("买买买");
    }

    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }

    @Override
    public void play() {
        System.out.println("玩玩玩");
    }
}
