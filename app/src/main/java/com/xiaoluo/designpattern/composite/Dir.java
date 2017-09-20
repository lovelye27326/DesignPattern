package com.xiaoluo.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件抽象类
 *
 * author: xiaoluo
 * date: 2017/9/18 18:32
 */
public abstract class Dir {
    // 存储文件夹下所有元素
    protected List<Dir> dirs = new ArrayList<>();
    // 当前文件夹或文件名
    private String name;

    public Dir(String name){
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public String getName() {
        return name;
    }

    public abstract void print();
}
