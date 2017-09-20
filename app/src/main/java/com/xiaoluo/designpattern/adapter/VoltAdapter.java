package com.xiaoluo.designpattern.adapter;

/**
 * 适配器,将220V转为5V
 *
 * author: xiaoluo
 * date: 2017/9/18 14:38
 */
public class VoltAdapter extends VoltResource220 implements Volt5 {

    // 在这个类里将220V转为5V

    @Override
    public int getVolt5() {
        getVolt220();
        System.out.println("转换成5V");
        return 5;
    }
}
