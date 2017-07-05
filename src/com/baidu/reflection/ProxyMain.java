package com.baidu.reflection;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/7/5.
 */
public class ProxyMain {
    public static void main(String[] args) {
        Proxied real = new ProxiedImpl();
        Proxied proxied = (Proxied) Proxy.newProxyInstance(Proxied.class.getClassLoader(),new Class[]{Proxied.class},new ProxyHandler(real));
        String a =proxied.print("hello world");
        System.out.println(a);
    }
}
