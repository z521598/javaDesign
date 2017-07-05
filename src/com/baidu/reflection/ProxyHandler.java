package com.baidu.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/5.
 */
public class ProxyHandler implements InvocationHandler {

    Proxied proxied;

    public ProxyHandler(Proxied proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hello before");
        Object obj = method.invoke(proxied, args);
        System.out.println("hello after");
        return obj;
    }
}
