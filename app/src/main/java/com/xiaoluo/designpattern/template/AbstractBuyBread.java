package com.xiaoluo.designpattern.template;

/**
 * author: xiaoluo
 * date: 2017/9/19 14:13
 */
public abstract class AbstractBuyBread {
    public final void buySomeBread() {
        getMoney();
        goShop();
        buy();
    }

    protected void getMoney() {
        System.out.println("找老爸要钱");
    }

    protected void goShop() {
        System.out.println("去商店");
    }

    protected void buy() {
        System.out.println("买面包");
    }
}
