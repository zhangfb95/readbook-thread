package com.juconcurrent.readbook.thread.chapter01.c1_6;

/**
 * @author zhangfb
 */
public class C01Test {

    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
