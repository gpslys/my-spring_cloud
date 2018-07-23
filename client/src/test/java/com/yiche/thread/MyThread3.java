package com.yiche.thread;

/**
 * Created by root on 2018/5/3.
 */
public class MyThread3 {
    public ThreadLocal<Long> id=new ThreadLocal<Long>();
    public ThreadLocal<String> name=new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };
    public void set(){
        id.set(Thread.currentThread().getId());
//        name.set(Thread.currentThread().getName());
    }
    public Long getId(){
        return id.get();
    }
    public String getName(){
        return name.get();
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread3 = new MyThread3();
        myThread3.set();
        System.out.println(myThread3.getId());
        System.out.println(myThread3.getName());
        Thread thread1=new Thread(()->{
            myThread3.set();
            System.out.println(myThread3.getId());
            System.out.println(myThread3.getName());
        });
        thread1.start();
        synchronized (Thread.currentThread()){
            Thread.currentThread().wait();
        }
        System.out.println(myThread3.getId());
        System.out.println(myThread3.getName());
    }
}
