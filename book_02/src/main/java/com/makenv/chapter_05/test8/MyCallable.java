package com.makenv.chapter_05.test8;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallable implements Callable {

    public Object call() throws Exception {

//        TimeUnit.SECONDS.sleep(1);
        System.out.println("线程运行");
        return "我的年龄是 100";
    }
}
