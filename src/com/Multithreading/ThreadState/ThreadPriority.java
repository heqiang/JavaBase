package com.Multithreading.ThreadState;

// 线程优先级
// 线程的优先级用数字表示 范围1-10
// 设置线程优先级只是意味着可能被cpu先调度执行 但是不一定会先执行
// cpu调度先执行优先级低的 会导致性能倒置
public class ThreadPriority {

    public static void main(String[] args) {
        //主线程默认的优先级为10
        System.out.println(Thread.currentThread().getName() + "->" + Thread.currentThread().getPriority());
        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority, "1");
        Thread t2 = new Thread(myPriority, "2");
        Thread t3 = new Thread(myPriority, "3");
        Thread t4 = new Thread(myPriority, "4");
        Thread t5 = new Thread(myPriority, "5");
        //先设置优先级 在启动
        t1.start();

        t2.setPriority(5);
        t2.start();

        t3.setPriority(10);
        t3.start();

        t4.setPriority(10);
        t4.start();

        t5.setPriority(6);
        t5.start();

    }
}


class MyPriority implements Runnable {

    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName() + "->" + Thread.currentThread().getPriority()
        );
    }
}
