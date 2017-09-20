package com.xiaoluo.designpattern.memento;

/**
 * author: xiaoluo
 * date: 2017/9/19 17:38
 */
public class MementoManager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
