package com.xiaoluo.designpattern.state;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:11
 */
public class MoneyControl {
    IState state;

    public void getMoney() {
        state = new MoneyState();
        System.out.println("拿到钱了");
    }

    public void clearMoney() {
        state = new PoorState();
        System.out.println("钱花光了");
    }

    public void buy(){
        state.buy();
    }

    public void eat(){
        state.eat();
    }

    public void play(){
        state.play();
    }
}
