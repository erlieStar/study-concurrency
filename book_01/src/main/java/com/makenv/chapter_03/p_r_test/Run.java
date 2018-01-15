package com.makenv.chapter_03.p_r_test;

public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        Thread threadp = new Thread(p);
        Thread threadc = new Thread(c);
        threadp.start();
        threadc.start();
    }
}
