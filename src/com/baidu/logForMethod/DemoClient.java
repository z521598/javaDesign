package com.baidu.logForMethod;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/7/6.
 */
public class DemoClient {
    // 通过动态代理执行方法的时候打印日志
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        TestService realTestService = new TestServiceImpl();
        TestService poxyTestService = (TestService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{TestService.class},new TestServiceProxy(realTestService));

        Class  cla = poxyTestService.load("com.baidu.annotation.AnnotedClass");
        System.out.println("cla:"+cla);
        Object obj = poxyTestService.getInstance(cla);
        System.out.println("obj:"+obj);
        String str = poxyTestService.getString(obj);
        System.out.println("str:"+str);

    }
}
