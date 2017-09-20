package com.xiaoluo.designpattern.adapter;

/**
 * 对象适配模式
 *
 * author: xiaoluo
 * date: 2017/9/18 14:48
 */
public class ObjectVoltAdapter implements Volt5 {
    private VoltResource220 resource220;

    public ObjectVoltAdapter(VoltResource220 resource) {
        this.resource220 = resource;
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
