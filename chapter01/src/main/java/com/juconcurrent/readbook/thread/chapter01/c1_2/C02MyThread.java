package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C02MyThread extends Thread {

    @Override public void run() {
        super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        C02MyThread myThread = new C02MyThread();

        // 单次调用
        myThread.start();
        System.out.println("运行结束");

        // 多次调用start，会出现异常`java.lang.IllegalThreadStateException`
        for (int i = 0; i < 2; i++) {
            myThread.start();
        }
    }
}
