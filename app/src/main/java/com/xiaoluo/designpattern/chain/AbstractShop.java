package com.xiaoluo.designpattern.chain;

/**
 * author: xiaoluo
 * date: 2017/9/19 16:08
 */
public abstract class AbstractShop {
    // 下一个节点
    public AbstractShop nextShop;

    public final void queryBook() {
        query();
        if (hasBook()) {
            System.out.println("有书!");
            buyBook();
        } else if (nextShop != null) {
            System.out.println("没有书!");
            nextShop.queryBook();
        }
    }

    public abstract void query();

    public abstract boolean hasBook();

    public abstract void buyBook();
}
