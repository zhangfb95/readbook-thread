package com.juconcurrent.readbook.thread.chapter01.c1_3;

/**
 * @author zhangfb
 */
public class C04CountOperate extends Thread {

    public C04CountOperate() {
        System.out.println("CountOperate--begin");
        // 这儿的Thread.currentThread().getName()指的是调用者线程
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        // 这儿的this指的是C04CountOperate(Runnable)
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate--end");
    }

    @Override public void run() {
        System.out.println("run--begin");
        // 这儿的Thread.currentThread().getName()指的是被调用者线程
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        // 这儿的this指的是C04CountOperate(Runnable)
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run--end");
    }

    public static void main(String[] args) {
        C04CountOperate runnable = new C04CountOperate();
        Thread t1 = new Thread(runnable);
        t1.setName("A");
        t1.start();
    }
}
