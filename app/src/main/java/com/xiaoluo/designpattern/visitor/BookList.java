package com.xiaoluo.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * author: xiaoluo
 * date: 2017/9/20 9:59
 */
public class BookList {
    List<Book> list = new ArrayList<>();

    public BookList() {
        list.add(new BookA("A1", "很好看", 100));
        list.add(new BookA("A2", "不好看", 90));
        list.add(new BookB("B1", "还行", 100));
        list.add(new BookB("B2", "一般般", 80));
    }

    // 展示给顾客
    public void showBook(IVisitor visitor) {
        for (Book book : list) {
            book.accept(visitor);
        }
    }
}
