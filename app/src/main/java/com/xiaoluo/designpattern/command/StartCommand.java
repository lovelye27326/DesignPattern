package com.xiaoluo.designpattern.command;

/**
 * author: xiaoluo
 * date: 2017/9/19 17:00
 */
public class StartCommand implements ICommand {
    private CellPhone phone;

    public StartCommand(CellPhone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.start();
    }
}
