package com.xiaoluo.designpattern.command;

/**
 * author: xiaoluo
 * date: 2017/9/19 17:01
 */
public class OffCommand implements ICommand {
    private CellPhone phone;

    public OffCommand(CellPhone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.off();
    }
}
