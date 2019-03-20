package com.juconcurrent.readbook.thread.chapter01.c1_4;

/**
 * @author zhangfb
 */
public class C01Run extends Thread {

    @Override public void run() {
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) {
        C01Run thread = new C01Run();
        System.out.println("begin ==" + thread.isAlive());
        thread.start();

        /*try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        // 这儿可能是true，也可能是false
        System.out.println("end ==" + thread.isAlive());
    }
}
