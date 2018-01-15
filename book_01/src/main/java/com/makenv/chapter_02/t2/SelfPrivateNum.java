package com.makenv.chapter_02.t2;

public class SelfPrivateNum {

    private int num = 0;
    public void add(String userName) {
        try {
            if (userName.equals("a")) {
                num = 100;
                Thread.sleep(1000);
            } else if (userName.equals("b")) {
                num = 200;
            }
            System.out.println(userName + " " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
