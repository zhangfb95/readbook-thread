package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C07Share extends Thread {

    private static int count = 5;

    public C07Share(String name) {
        super();
        this.setName(name);
    }

    @Override public void run() {
        super.run();
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
    }

    public static void main(String[] args) {
        C07Share a = new C07Share("A");
        C07Share b = new C07Share("B");
        C07Share c = new C07Share("C");
        a.start();
        b.start();
        c.start();
    }
}
