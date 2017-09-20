package com.xiaoluo.designpattern.bridge;

/**
 * 衣服
 *
 * author: xiaoluo
 * date: 2017/9/18 17:49
 */
public abstract class Clothes {
    ISize size;

    public Clothes(ISize size) {
        this.size = size;
    }

    public void wear() {
        System.out.println(size.getSize() + getClothes());
    }

    protected abstract String getClothes();
}
