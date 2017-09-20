package com.xiaoluo.designpattern.visitor;

/**
 * author: xiaoluo
 * date: 2017/9/19 18:49
 */
public interface IVisitor {
    void visit(BookA bookA);
    void visit(BookB bookB);
}
