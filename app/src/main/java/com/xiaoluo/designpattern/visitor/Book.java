package com.xiaoluo.designpattern.visitor;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:50
 */
public abstract class Book {
    public String name;
    public String value;
    public int price;

    public Book(String name, String value, int price) {
        this.name = name;
        this.value = value;
        this.price = price;
    }

    public abstract void accept(IVisitor visitor);
}
