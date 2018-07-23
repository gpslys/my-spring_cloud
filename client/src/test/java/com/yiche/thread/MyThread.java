package com.yiche.thread;

/**
 * Created by root on 2018/5/3.
 */
public class MyThread {
    public static boolean flag;
    public static int a;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new ReadThread().start();
        }
        Thread.sleep(100);
        flag = true;
        Thread.yield();
        a = 11;
        System.out.println(a + "主");
    }

    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!flag) {
                Thread.yield();
            }
            System.out.println(a);
        }
    }
}
