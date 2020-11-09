package com.Multithreading.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockThread {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"小张").start();

    }
}
/*
* Lock是显示锁
* synchronized 是隐式锁 出了作用域自动释放锁
*
* */

class  Ticket implements Runnable{
    private int ticketName=20;

    private  final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
       while (true){
           try {
               lock.lock();
               if (ticketName<=0){
                   break;
               }else {

                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+"购买了第"+ticketName--+"涨票");
               }

           }finally {
              lock.unlock();
           }





       }
    }
}