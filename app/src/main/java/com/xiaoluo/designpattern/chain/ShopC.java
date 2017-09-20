package com.xiaoluo.designpattern.chain;

/**
 * author: xiaoluo
 * date: 2017/9/19 16:12
 */
public class ShopC extends AbstractShop {
    @Override
    public void query() {
        System.out.println("Shop C开始查询");
    }

    @Override
    public boolean hasBook() {
        return true;
    }

    @Override
    public void buyBook() {
        System.out.println("在Shop C买到了书");
    }
}
