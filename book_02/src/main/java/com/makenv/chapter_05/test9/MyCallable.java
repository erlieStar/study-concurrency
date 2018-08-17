package com.makenv.chapter_05.test9;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public String call() throws Exception {
        int i = 0;
        while (i == 0) {
            // 用这个条件退出已经运行的线程
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            System.out.println("正在运行中");
        }
        return "我的年龄是 100";
    }
}
