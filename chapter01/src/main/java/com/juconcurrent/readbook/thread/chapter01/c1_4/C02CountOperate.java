package com.juconcurrent.readbook.thread.chapter01.c1_4;

/**
 * @author zhangfb
 */
public class C02CountOperate extends Thread {

    public C02CountOperate() {
        System.out.println("CountOperate--begin");
        // 这儿的Thread.currentThread().getName()指的是调用者线程
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        // 这儿的this指的是C02CountOperate(Runnable)
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("CountOperate--end");
    }

    @Override public void run() {
        System.out.println("run--begin");
        // 这儿的Thread.currentThread().getName()指的是被调用者线程
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        // 这儿的this指的是C02CountOperate(Runnable)
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("run--end");
    }

    public static void main(String[] args) {
        C02CountOperate runnable = new C02CountOperate();
        Thread t1 = new Thread(runnable);
        System.out.println("main begin t1 isAlive()=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive()=" + t1.isAlive());
    }
}
