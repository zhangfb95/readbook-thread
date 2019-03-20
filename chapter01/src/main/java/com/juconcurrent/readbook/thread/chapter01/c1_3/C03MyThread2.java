package com.juconcurrent.readbook.thread.chapter01.c1_3;

/**
 * @author zhangfb
 */
public class C03MyThread2 extends Thread {

    public C03MyThread2() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        C03MyThread2 myThread = new C03MyThread2();
        myThread.run();
    }
}
