package com.makenv.chapter_05.future_callable_1;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private int age;

    public MyCallable(int age) {
        this.age = age;
    }

    public String call() throws Exception {
        Thread.sleep(2000);
        return "返回值年龄是 " + age;
    }
}
