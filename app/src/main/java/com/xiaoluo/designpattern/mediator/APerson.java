package com.xiaoluo.designpattern.mediator;

/**
 * author: xiaoluo
 * date: 2017/9/20 10:53
 */
public abstract class APerson {
    protected Mediator mediator;

    public APerson(Mediator mediator) {
        this.mediator = mediator;
    }
}
