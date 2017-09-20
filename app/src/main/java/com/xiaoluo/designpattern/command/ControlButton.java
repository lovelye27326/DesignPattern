package com.xiaoluo.designpattern.command;

/**
 * author: xiaoluo
 * date: 2017/9/19 17:02
 */
public class ControlButton {
    private ICommand startCommand;
    private ICommand offCommand;

    public ControlButton(ICommand start, ICommand off) {
        this.startCommand = start;
        this.offCommand = off;
    }

    public void start() {
        startCommand.execute();
    }

    public void off() {
        offCommand.execute();
    }
}
