package com.Multithreading.ThreadState;

// 礼让线程
// 礼让不一定成功 看cpu
public class ThreadYield {

}



class  MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
        //线程礼让
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程开始");
    }
}