package com.xiaoluo.designpattern.facade;

/**
 * author: xiaoluo
 * date: 2017/9/18 16:57
 */
public class Computer {
    CPU cpu = new CPU();
    Display display = new Display();

    // 开机
    public void start() {
        cpu.start();
        display.start();
    }
}
