package com.makenv.chapter_05.futureLast;

import java.util.concurrent.Callable;

/**
 * @Author: lilimin
 * @Date: 2019/4/4 15:33
 */
public class MyCallable implements Callable<String> {

    private String username;
    private long sleepValue;

    public MyCallable(String username, long sleepValue) {
        this.username = username;
        this.sleepValue = sleepValue;
    }


    @Override
    public String call() throws Exception {
        System.out.println(username);
        Thread.sleep(sleepValue);
        return "return " + username;
    }
}
