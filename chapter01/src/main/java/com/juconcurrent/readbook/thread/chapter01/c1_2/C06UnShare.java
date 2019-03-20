package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C06UnShare extends Thread {

    private int count = 5;

    public C06UnShare(String name) {
        super();
        this.setName(name);
    }

    @Override public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        C06UnShare a = new C06UnShare("A");
        C06UnShare b = new C06UnShare("B");
        C06UnShare c = new C06UnShare("C");
        a.start();
        b.start();
        c.start();
    }
}
