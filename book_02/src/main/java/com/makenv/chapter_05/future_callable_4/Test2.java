package com.makenv.chapter_05.future_callable_4;

import java.util.concurrent.*;

/**
 * @Author: lilimin
 * @Date: 2019/4/4 15:07
 */
public class Test2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {Thread.sleep(2000); return "我的年龄是";};
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(callable);
        // true true
        System.out.println(future.cancel(true) + " " + future.isCancelled());
        // 抛出CancellationException异常
        System.out.println(future.get());
        service.shutdown();
    }
}
