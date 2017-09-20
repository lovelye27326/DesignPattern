package com.xiaoluo.designpattern.bridge;

/**
 * author: xiaoluo
 * date: 2017/9/18 17:56
 */
public class Dress extends Clothes {
    public Dress(ISize size) {
        super(size);
    }

    @Override
    protected String getClothes() {
        return "dress";
    }
}
