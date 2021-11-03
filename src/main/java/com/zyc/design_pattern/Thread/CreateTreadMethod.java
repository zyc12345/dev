package com.zyc.design_pattern.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateTreadMethod {

    public static void main(String[] args) {
        // 继承Thread
        MyThread myThread = new MyThread();
        // 实现runnable方法
        Thread thread = new Thread(new MyThreadRunnable());
        myThread.start();
        thread.start();
        // 使用Lambda
        Thread thread1 = new Thread(() -> {
            System.out.println("==========="+Thread.currentThread().getName());
        });
        thread1.start();

        // 线程池创建线程
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println("线程池创建的线程"+Thread.currentThread().getName());
        });

    }
}
class MyThread extends Thread{
    public MyThread() {
    }

    @Override
    public void run() {
        System.out.println("创建线程开始运行~"+Thread.currentThread().getName());
    }

}

class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("实现接口创建线程开始运行~"+Thread.currentThread().getName());
    }
}
