package com.Multithreading;

import com.base.day03.ExecptionClass.Test;

//抢火车票
public class TestThread  implements Runnable{

    //票数
    private int ticketNums = 20;


    @Override
    public void run() {
        while (true){
            if(ticketNums<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"抢到了第"+ticketNums--+"张票");
        }


    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        new Thread(testThread,"小明").start();
        new Thread(testThread,"大爷").start();
        new Thread(testThread,"黄牛党").start();

    }
}
