package com.baidu.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Administrator on 2017/7/11.
 */
public class ExecutorService3 {
    Executor executor = Executors.newFixedThreadPool(10);
    {
        Thread.setDefaultUncaughtExceptionHandler(new UnCatchExceptionHandler());
    }
    public void excute(Runnable runnable) {

        executor.execute(runnable);
    }
}
