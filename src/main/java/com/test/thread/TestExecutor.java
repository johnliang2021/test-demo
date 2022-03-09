package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author
 * @version V1.0
 * @description
 * @date 2022/3/9 15:44
 */
public class TestExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }
}
