package com.makenv.chapter_05.future_callable_1;

import java.util.concurrent.*;

public class Run {

    public static void main(String[] args) {
            try {
            MyCallable callable = new MyCallable(100);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque());
            Future<String> future = threadPoolExecutor.submit(callable);
            System.out.println("main " + System.currentTimeMillis());
            System.out.println(future.get());
            /*
                main 1516003892496
                返回值年龄是 100
                main 1516003894497
             */
            System.out.println("main " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}