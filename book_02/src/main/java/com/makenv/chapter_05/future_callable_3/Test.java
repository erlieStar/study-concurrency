package com.makenv.chapter_05.future_callable_3;

import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) {

        Userinfo userinfo = new Userinfo();
        MyRunnable runnable = new MyRunnable(userinfo);
//        ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService service = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        // 方法submit(Runnable, T result)的第二个参数result可以作为执行结果的返回值，而不需要使用
        // get()方法来进行获得
        // usernameValue passwordValue
        Future<Userinfo> future = service.submit(runnable, userinfo);
        try {
            userinfo = future.get();
            System.out.println(userinfo.getUsername() + " " + userinfo.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
