package com.baidu.reflection;

/**
 * Created by Administrator on 2017/7/5.
 */
public class ProxiedImpl implements Proxied {

    @Override
    public String print(String s) {
        System.out.println(s);
        return "s:" + s;
    }
}
