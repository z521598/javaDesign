package com.baidu.logForMethod;



/**
 * Created by Administrator on 2017/7/5.
 */
public class TestServiceImpl implements TestService {


    @Override
    public Class<?> load(String className) throws ClassNotFoundException {
        return Class.forName(className);
    }


    @Override
    public Object getInstance(Class classObj) throws IllegalAccessException, InstantiationException {
        return  classObj.newInstance();
    }

    @LogInfo("打印对象")
    @Override
    public String getString(Object object) {
        return object.toString();
    }
}
