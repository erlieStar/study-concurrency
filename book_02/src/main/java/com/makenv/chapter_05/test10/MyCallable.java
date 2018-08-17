package com.makenv.chapter_05.test10;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public String call() throws Exception {
        int i = 0;
        while (i == 0) {
            System.out.println("正在运行中");
        }
        return "我的年龄是 100";
    }
}
