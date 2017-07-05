package com.baidu.reflection;

import com.baidu.annotation.ClassAnnotation;
import com.baidu.annotation.MethodAnnotation;

import java.lang.reflect.Method;

public class RefMain {

    public static void main(String[] args) {
        try {
            Class cla = Class.forName("com.baidu.annotation.AnnotedClass");
            // 获取类注解
            ClassAnnotation classAnnotation = (ClassAnnotation) cla.getAnnotation(ClassAnnotation.class);
            System.out.println(classAnnotation.value());
            // 获取方法注解
            Method[] methods = cla.getMethods();
            for (int i = 0; i < methods.length; i++) {
                if (methods[i].getDeclaredAnnotations().length != 0) {
                    MethodAnnotation methodAnnotations = methods[i].getAnnotation(MethodAnnotation.class);
                    System.out.println(methodAnnotations.value());
                    // 动态向方法中传递参数
                    methods[i].invoke(cla.newInstance(),"i am child,"+methodAnnotations.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
