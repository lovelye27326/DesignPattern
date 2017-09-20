package com.xiaoluo.designpattern.visitor;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:53
 */
public class BookA extends Book {
    public BookA(String name, String value, int price) {
        super(name, value, price);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
