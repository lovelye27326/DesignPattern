package com.xiaoluo.designpattern.interpreter;

/**
 * author: xiaoluo
 * date: 2017/9/20 14:17
 */
public class StarExpression extends AbstractExpression {
    @Override
    public void interpret(String value) {
        if ("*".equals(value.substring(value.length() - 1))) {
            String num = value.substring(0, value.length() - 1);
            int result = Integer.parseInt(num) + 1;
            System.out.println(value + "的计算结果是:" + result);
        }
    }
}
