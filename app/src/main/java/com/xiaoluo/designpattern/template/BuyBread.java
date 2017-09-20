package com.xiaoluo.designpattern.template;

/**
 * author: xiaoluo
 * date: 2017/9/19 14:16
 */
public class BuyBread extends AbstractBuyBread {
    @Override
    protected void goShop() {
        System.out.println("骑单车去商店");
    }
}
