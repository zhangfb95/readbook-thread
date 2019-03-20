package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C05Runnable implements Runnable {

    @Override public void run() {
        System.out.println("运行中！");
    }

    public static void main(String[] args) {
        Runnable runnable = new C05Runnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
