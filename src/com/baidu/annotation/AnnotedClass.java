package com.baidu.annotation;

import com.baidu.annotation.ClassAnnotation;
import com.baidu.annotation.MethodAnnotation;

/**
 * Created by Administrator on 2017/7/5.
 */
@ClassAnnotation("hello,class")
public class AnnotedClass {

    @MethodAnnotation("hello method")
    public void method1(String str){
        System.out.println(str);
    }
}
