package com.baidu.annotation;

/**
 * Created by langshiquan on 17/7/1.
 */
@Test(name = "hello")
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello,world!");
        Class<Main> clazz = Main.class;
        // 得到类注解
        Test myClassAnnotation = clazz.getAnnotation(Test.class);
//        System.out.println(myClassAnnotation.annotationType());
        System.out.println(myClassAnnotation.name());

    }
}
