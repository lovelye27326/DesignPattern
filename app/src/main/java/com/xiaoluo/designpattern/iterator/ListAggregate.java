package com.xiaoluo.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * author: xiaoluo
 * date: 2017/9/19 15:36
 */
public class ListAggregate implements IScoreAggregate {
    private List<String> list = new ArrayList<>();

    public ListAggregate() {
        list.add("小明:100");
        list.add("小白:80");
        list.add("小黄:60");
    }

    @Override
    public IScoreIterator getIterator() {
        return new ListIterator(list);
    }
}
