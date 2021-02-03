package com.Multithreading.ThreadState;


//模拟延时
public class ThreadSleep implements Runnable {
    private static int ticket = 25;

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticket-- + "张票");
        }
    }

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();

        new Thread(threadSleep, "小明").start();
        new Thread(threadSleep, "小红").start();
        new Thread(threadSleep, "小李").start();


    }


}
