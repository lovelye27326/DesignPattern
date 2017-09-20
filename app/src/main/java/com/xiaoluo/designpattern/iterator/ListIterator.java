package com.xiaoluo.designpattern.iterator;

import java.util.List;

/**
 * author: xiaoluo
 * date: 2017/9/19 15:30
 */
public class ListIterator implements IScoreIterator {
    private List<String> list;
    private int position = 0;

    public ListIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        String score = list.get(position);
        position++;
        return score;
    }
}
