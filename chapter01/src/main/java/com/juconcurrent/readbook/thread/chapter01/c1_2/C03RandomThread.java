package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C03RandomThread extends Thread {

    @Override public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            C03RandomThread thread = new C03RandomThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
