package com.makenv.chapter_05.future_callable_4;

import java.util.concurrent.*;

/**
 * @Author: lilimin
 * @Date: 2019/4/4 15:07
 */
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // cancel(boolean mayInterruptIfRunning)的参数的作用是，如果线程正在运行是否中断正在运行的线程
        Callable<String> callable = () -> {Thread.sleep(2000); return "我的年龄是";};
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(callable);
        // 我的年龄是
        System.out.println(future.get());
        // false false
        System.out.println(future.cancel(true) + " " + future.isCancelled());
        service.shutdown();
    }
}
