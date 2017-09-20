package com.xiaoluo.designpattern.bridge;

/**
 * author: xiaoluo
 * date: 2017/9/18 17:57
 */
public class SmallSize implements ISize {
    @Override
    public String getSize() {
        return "小号";
    }
}
