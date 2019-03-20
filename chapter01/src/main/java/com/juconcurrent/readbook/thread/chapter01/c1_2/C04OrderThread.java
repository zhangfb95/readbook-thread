package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C04OrderThread extends Thread {

    private int i;

    public C04OrderThread(int i) {
        this.i = i;
    }

    @Override public void run() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        C04OrderThread[] threads = new C04OrderThread[14];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new C04OrderThread(i);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}

