package com.juconcurrent.readbook.thread.chapter01.c1_7;

/**
 * @author zhangfb
 */
public class C02Interrupted extends Thread {

    @Override public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            //System.out.println("i=" + i);
        }
    }

    public static void main(String[] args) {
        try {
            C02Interrupted thread = new C02Interrupted();
            thread.start();
            Thread.sleep(2000L);
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.interrupted());
            System.out.println("是否停止2？=" + thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
