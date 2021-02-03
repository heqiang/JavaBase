package com.Multithreading;

import java.util.TreeMap;

// 模拟龟兔赛跑
public class Race implements Runnable {

    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            String threadName = Thread.currentThread().getName();
            if (threadName.equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag = gameOver(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "==>跑了" + i + "步");

        }
    }

    public static boolean gameOver(int step) {
        // 首先判断winner是有有值

        if (winner != null) {
            return true;
        }
        {
            if (step >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("胜利者是：" + winner);
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();

    }


}
