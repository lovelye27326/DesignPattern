package com.xiaoluo.designpattern.visitor;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:57
 */
public class BookB extends Book {
    public BookB(String name, String value, int price) {
        super(name, value, price);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
