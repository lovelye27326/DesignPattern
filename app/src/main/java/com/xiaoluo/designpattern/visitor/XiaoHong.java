package com.xiaoluo.designpattern.visitor;

/**
 * author: xiaoluo
 * date: 2017/9/20 9:56
 */
public class XiaoHong implements IVisitor {
    @Override
    public void visit(BookA bookA) {
        System.out.println("小红看了下" + bookA.name + "的内容:" + bookA.value);
    }

    @Override
    public void visit(BookB bookB) {
        System.out.println("小红看了下" + bookB.name + "的内容:" + bookB.value);
    }
}
