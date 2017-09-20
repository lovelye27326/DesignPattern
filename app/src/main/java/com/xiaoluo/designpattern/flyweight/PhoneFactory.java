package com.xiaoluo.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author: xiaoluo
 * date: 2017/9/19 10:28
 */
public class PhoneFactory {
    // map缓存对象
    private static Map<String, PhoneInfo> phones = new HashMap<>();

    public static PhoneInfo getPhoneInfo(String phone) {
        String key = phone;
        if (phones.containsKey(key)) {
            return phones.get(key);
        } else {
            PhoneInfo phoneInfo = new PhoneInfo(phone);
            phones.put(key, phoneInfo);
            return phoneInfo;
        }
    }
}
