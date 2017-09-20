package com.xiaoluo.designpattern.composite;

import java.util.Iterator;

/**
 * author: xiaoluo
 * date: 2017/9/18 18:35
 */
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void print() {
        System.out.print(getName() + "(");
        Iterator<Dir> iter = dirs.iterator();
        while (iter.hasNext()) {
            Dir dir = iter.next();
            dir.print();
            if (iter.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }
}
