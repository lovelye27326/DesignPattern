package com.xiaoluo.designpattern.strategy;

/**
 * author: xiaoluo
 * date: 2017/9/19 11:33
 */
public class CalculateStrategy {
    private ICalculate calculate;

    public void setCalculate(ICalculate calculate) {
        this.calculate = calculate;
    }

    public void cost() {
        System.out.println(calculate.name() + "花费" + calculate.cost());
    }
}
