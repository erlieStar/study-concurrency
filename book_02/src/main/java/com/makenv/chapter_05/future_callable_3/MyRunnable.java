package com.makenv.chapter_05.future_callable_3;


public class MyRunnable implements Runnable {

    private Userinfo userinfo;

    public MyRunnable(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        userinfo.setUsername("usernameValue");
        userinfo.setPassword("passwordValue");
    }
}
