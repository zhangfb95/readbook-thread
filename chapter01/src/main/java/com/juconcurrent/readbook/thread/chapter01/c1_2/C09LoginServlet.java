package com.juconcurrent.readbook.thread.chapter01.c1_2;

/**
 * @author zhangfb
 */
public class C09LoginServlet {

    private static String username;
    private static String password;

    public static void doPost(String username, String password) {
        try {
            C09LoginServlet.username = username;
            C09LoginServlet.password = password;
            if (username.equals("a")) {
                Thread.sleep(5000L);
            }
            C09LoginServlet.password=password;
            System.out.println("username=" + C09LoginServlet.username + ", password=" + C09LoginServlet.password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override public void run() {
                C09LoginServlet.doPost("a", "aa");
            }
        }).start();

        new Thread(new Runnable() {
            @Override public void run() {
                C09LoginServlet.doPost("b", "bb");
            }
        }).start();
    }
}
