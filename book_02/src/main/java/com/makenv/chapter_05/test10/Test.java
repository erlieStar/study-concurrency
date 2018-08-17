package com.makenv.chapter_05.test10;

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
        // 线程一直运行，并没有中断
        System.out.println(future.cancel(true) + " " + future.isCancelled());
    }
}
