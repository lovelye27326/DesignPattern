package com.xiaoluo.designpattern.singleTon;

/**
 * 单例模式
 *
 * author: xiaoluo
 * date: 2017/9/15 15:53
 */
public class SingleTon {
    // 使用static volatile修饰
    private static volatile SingleTon sInstance;

    // 构造函数私有化,防止外部进行实例化
    private SingleTon() {
    }

    // 获取instance,使用synchronized同步处理,双重判断null
    public static SingleTon getInstance() {
        if (sInstance == null) {
            synchronized (SingleTon.class) {
                if (sInstance == null) {
                    sInstance = new SingleTon();
                }
            }
        }
        System.out.println("这是一个单例对象");
        return sInstance;
    }
}
