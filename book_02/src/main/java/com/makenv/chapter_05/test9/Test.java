package com.makenv.chapter_05.test9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        MyCallable myCallable = new MyCallable();
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(myCallable);
        TimeUnit.SECONDS.sleep(2);
        /*
            正在运行中
            正在运行中
            正在运行中
            正在运行中
            true true
         */
        System.out.println(future.cancel(true) + " " + future.isCancelled());
    }
}
