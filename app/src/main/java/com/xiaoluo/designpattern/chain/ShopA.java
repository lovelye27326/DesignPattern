package com.xiaoluo.designpattern.chain;

/**
 * author: xiaoluo
 * date: 2017/9/19 16:11
 */
public class ShopA extends AbstractShop {
    @Override
    public void query() {
        System.out.println("Shop A开始查询");
    }

    @Override
    public boolean hasBook() {
        return false;
    }

    @Override
    public void buyBook() {
        System.out.println("在Shop A买到了书");
    }
}
