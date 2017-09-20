package com.xiaoluo.designpattern.composite;

/**
 * author: xiaoluo
 * date: 2017/9/18 18:37
 */
public class File extends Dir {
    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        System.out.print("文件不支持添加");
    }

    @Override
    public void print() {
        System.out.print(getName());
    }
}
