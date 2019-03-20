package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C08ShareSafe extends Thread {

    private static int count = 5;

    public C08ShareSafe(String name) {
        super();
        this.setName(name);
    }

    @Override public void run() {
        synchronized (C08ShareSafe.class) {
            super.run();
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        C08ShareSafe a = new C08ShareSafe("A");
        C08ShareSafe b = new C08ShareSafe("B");
        C08ShareSafe c = new C08ShareSafe("C");
        a.start();
        b.start();
        c.start();
    }
}
