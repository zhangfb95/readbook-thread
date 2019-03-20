package com.juconcurrent.readbook.thread.chapter01.c1_5;

/**
 * @author zhangfb
 */
public class C01MyThread extends Thread {

    @Override public void run() {
        try {
            System.out.println("run threadName=" + Thread.currentThread().getName() + " begin");
            Thread.sleep(2000L);
            System.out.println("run threadName=" + Thread.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        C01MyThread myThread = new C01MyThread();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.run();
        System.out.println("end   = " + System.currentTimeMillis());
    }
}
