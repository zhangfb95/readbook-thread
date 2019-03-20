package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C10SafeLoginServlet {

    private static String username;
    private static String password;

    synchronized public static void doPost(String username, String password) {
        try {
            C10SafeLoginServlet.username = username;
            C10SafeLoginServlet.password = password;
            if (username.equals("a")) {
                Thread.sleep(5000L);
            }
            C10SafeLoginServlet.password = password;
            System.out.println("username=" + C10SafeLoginServlet.username + ", password=" + C10SafeLoginServlet.password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override public void run() {
                C10SafeLoginServlet.doPost("a", "aa");
            }
        }).start();

        new Thread(new Runnable() {
            @Override public void run() {
                C10SafeLoginServlet.doPost("b", "bb");
            }
        }).start();
    }
}
