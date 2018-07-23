package com.yiche.thread;

/**
 * Created by root on 2018/5/3.
 */
public class MyThread2 {
    public volatile int a = 0;

    public synchronized void increase() {
        a++;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int m = 1; m <= 1000; m++) {
                    myThread2.increase();
                }
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(myThread2.a);
    }
}
