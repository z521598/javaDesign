package com.baidu.concurrent;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/7/12.
 */
public class ExecutorService2 {
    public static void main(String[] args) {
        // ExecutorService 是具有生命周期的Executor
        ExecutorService executorService = Executors.newFixedThreadPool(10);

    }
}
