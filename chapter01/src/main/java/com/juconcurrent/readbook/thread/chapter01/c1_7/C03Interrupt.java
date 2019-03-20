package com.juconcurrent.readbook.thread.chapter01.c1_7;

/**
 * @author zhangfb
 */
public class C03Interrupt extends Thread {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？=" + Thread.interrupted());
        System.out.println("是否停止2？=" + Thread.interrupted());
        System.out.println("end!");
    }
}
