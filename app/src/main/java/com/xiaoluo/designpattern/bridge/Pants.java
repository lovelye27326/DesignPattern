package com.xiaoluo.designpattern.bridge;

/**
 * author: xiaoluo
 * date: 2017/9/18 17:53
 */
public class Pants extends Clothes {
    public Pants(ISize size) {
        super(size);
    }

    @Override
    protected String getClothes() {
        return "pants";
    }
}
