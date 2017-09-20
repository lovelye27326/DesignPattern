package com.xiaoluo.designpattern.mediator;

/**
 * author: xiaoluo
 * date: 2017/9/20 11:03
 */
public class HouseMediator extends Mediator {
    private XiaoWang xiaoWang;
    private Landlord landlord;

    public void setXiaoWang(XiaoWang person) {
        xiaoWang = person;
    }

    public void setLandlord(Landlord person) {
        landlord = person;
    }

    @Override
    public void operate(APerson person) {
        if (person == xiaoWang) {
            landlord.getInfo();
            landlord.tell();
        } else {
            xiaoWang.getPrice();
        }
    }
}
