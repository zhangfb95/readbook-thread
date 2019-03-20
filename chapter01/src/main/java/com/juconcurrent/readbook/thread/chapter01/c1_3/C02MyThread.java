package com.juconcurrent.readbook.thread.chapter01.c1_3;

/**
 * @author zhangfb
 */
public class C02MyThread extends Thread {

    public C02MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        C02MyThread myThread = new C02MyThread();
        myThread.start();
    }
}
