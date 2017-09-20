package com.xiaoluo.designpattern.chain;

/**
 * author: xiaoluo
 * date: 2017/9/19 16:12
 */
public class ShopB extends AbstractShop {
    @Override
    public void query() {
        System.out.println("Shop B开始查询");
    }

    @Override
    public boolean hasBook() {
        return false;
    }

    @Override
    public void buyBook() {
        System.out.println("在Shop B买到了书");
    }
}
