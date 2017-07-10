package com.baidu.logForMethod;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/6.
 */
public class TestServiceProxy implements InvocationHandler {
    private TestService testService;

    public TestServiceProxy(TestService testService) {
        this.testService = testService;
    }
    private Object object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(testService, args);
        if (method.isAnnotationPresent(LogInfo.class)) {
            LogInfo logInfo = method.getAnnotation(LogInfo.class);
            System.out.println(new Date() + "" + logInfo.value() + "： method-" + method.getReturnType() + " " + method.getName() + " run with param " + getMethodParamString(method) + " args:" + args);
        }
        return object;
    }

    private String getMethodParamString(Method method) {
        StringBuilder stringBuilder = new StringBuilder();
        Class<?>[] classes = method.getParameterTypes();
        for (int i = 0; classes != null && i < classes.length; i++) {
            stringBuilder.append(classes[i].getName() + ";");
        }
        return stringBuilder.toString();
    }
}
