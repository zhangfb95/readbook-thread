package com.juconcurrent.readbook.thread.chapter01.c1_7;

/**
 * @author zhangfb
 */
public class C04IsInterrupted extends Thread {

    @Override public void run() {
        super.run();
        while (true) {
        }
    }

    public static void main(String[] args) {
        try {
            C04IsInterrupted thread = new C04IsInterrupted();
            thread.start();
            Thread.sleep(2000L);
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
