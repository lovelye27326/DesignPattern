package com.xiaoluo.designpattern.observer;

import java.util.Observable;

/**
 * author: xiaoluo
 * date: 2017/9/19 14:45
 */
public class ComicApp extends Observable {
    public void hasNew(String comic) {
        System.out.println(comic + "更新了");
        setChanged();
        notifyObservers(comic);
    }
}
