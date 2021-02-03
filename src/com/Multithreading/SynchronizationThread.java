package com.Multithreading;


//线程同步
//弊端  需要修改的内容才需要锁  锁的太多 影响性能
//synchronized默认的锁的是this这个对象  应该找准变化的量 然后锁
public class SynchronizationThread {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "小明").start();
        new Thread(buyTicket, "小兰").start();
        new Thread(buyTicket, "黄牛").start();
    }


}

class BuyTicket implements Runnable {
    private int tickets = 15;
    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 加synchronized后成为同步方法
    public synchronized void buy() throws InterruptedException {
        if (tickets <= 0) {
            flag = false;
            return;
        }
        // 使用线程休眠可以放大线程不安全问题
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + "购买了第" + tickets-- + "涨票");
    }


}
