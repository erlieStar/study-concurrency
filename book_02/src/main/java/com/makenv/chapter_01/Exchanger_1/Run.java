package com.makenv.chapter_01.Exchanger_1;

import java.util.concurrent.Exchanger;

public class Run {
    public static void main(String[] args) {
        /*
         * 类Exchanger的exchange()方法具有阻塞的特色，此方法被调用后等待线程来取得数据
         * 如果没有其他线程来取数据，则一直阻塞
         */
        Exchanger<String> exchanger = new Exchanger<String>();
        ThreadA threadA = new ThreadA(exchanger);
        threadA.start();
        //main end
        System.out.println("main end");
    }
}
