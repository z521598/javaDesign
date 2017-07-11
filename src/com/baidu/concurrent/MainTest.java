package com.baidu.concurrent;

/**
 * Created by Administrator on 2017/7/11.
 */
public class MainTest {
    public static void main(String[] args) {
        ExecutorService3 executorService3 = new ExecutorService3();
//        Thread.setDefaultUncaughtExceptionHandler(new UnCatchExceptionHandler());
//        Executor executor = Executors.newFixedThreadPool(10);
//
//        try {
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    throw new RuntimeException("hello exception");
//                }
//            });
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
        executorService3.excute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.activeCount());
            }
        });
    }
}
