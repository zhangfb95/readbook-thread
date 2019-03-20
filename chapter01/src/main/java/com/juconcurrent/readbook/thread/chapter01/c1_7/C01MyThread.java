package com.juconcurrent.readbook.thread.chapter01.c1_7;

/**
 * @author zhangfb
 */
public class C01MyThread extends Thread {

    @Override public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + i);
        }
    }

    public static void main(String[] args) {
        try {
            C01MyThread thread = new C01MyThread();
            thread.start();
            Thread.sleep(2000L);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
