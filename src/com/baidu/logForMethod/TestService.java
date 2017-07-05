package com.baidu.logForMethod;



/**
 * Created by Administrator on 2017/7/5.
 */
public interface TestService {
    @LogInfo("JVM加载")
    public Class<?> load(String className) throws ClassNotFoundException;

    @LogInfo("获取实例")
    public Object getInstance(Class classObj) throws IllegalAccessException, InstantiationException;


    public String getString(Object object);
}
