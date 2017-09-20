package com.xiaoluo.designpattern.visitor;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:54
 */
public class XiaoMin implements IVisitor {
    @Override
    public void visit(BookA bookA) {
        System.out.println("小明看了下" + bookA.name + "的价格:" + bookA.price);
    }

    @Override
    public void visit(BookB bookB) {
        System.out.println("小明看了下" + bookB.name + "的价格:" + bookB.price);
    }
}
