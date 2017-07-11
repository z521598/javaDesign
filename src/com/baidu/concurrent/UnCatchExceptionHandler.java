package com.baidu.concurrent;

/**
 * Created by Administrator on 2017/7/11.
 */
public class UnCatchExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + " exception:" + e.getMessage());
        e.printStackTrace();
    }
}
