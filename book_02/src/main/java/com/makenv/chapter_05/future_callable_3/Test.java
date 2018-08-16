package com.makenv.chapter_05.future_callable_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable(10);
        ExecutorService service = Executors.newCachedThreadPool();
        int sum = 0;
        Future<Integer> future = service.submit(runnable, sum);
        try {
            sum = future.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
