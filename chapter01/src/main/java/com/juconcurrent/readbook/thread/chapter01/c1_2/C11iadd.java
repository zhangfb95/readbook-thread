package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C11iadd {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            private int i = 5;

            @Override public void run() {
                System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
            }
        };

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}
