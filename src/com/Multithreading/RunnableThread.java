package com.Multithreading;

//创建线程方式2 :实现runable接口，执行线程需要丢入runnable接口实现类，调用start方法
// 推荐使用Runnable 接口多继承
public class RunnableThread implements Runnable {

    public  String name;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("hello" + "+" + this.name);

        }
    }
    public  RunnableThread(String threadName){
        this.name = threadName;
    }

    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread(Thread.currentThread().getName());
        RunnableThread runnableThread1 = new RunnableThread(Thread.currentThread().getName());
        RunnableThread runnableThread2 = new RunnableThread(Thread.currentThread().getName());
        new Thread(runnableThread).start();
        new Thread(runnableThread1).start();
        new Thread(runnableThread2).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("hello" + "+" + Thread.currentThread().getName());

        }
    }
}
