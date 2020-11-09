package com.Multithreading;

//守护线程 是一个不用管的线程 等主要线程结束就跟着结束
//
public class DaemonThread {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        GodDaemonThread godDaemonThread = new GodDaemonThread();

        Thread thread = new Thread(myDaemonThread);
        Thread thread1 = new Thread(godDaemonThread);
        thread1.setDaemon(true);
        thread.start();
        thread1.start();

    }

}


class  MyDaemonThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            System.out.println("开心的活着");
        }
        System.out.println("GoodBye");
    }
}
class  GodDaemonThread implements Runnable{

    @Override
    public void run() {
       while (true){
           System.out.println("God bless you");
       }
    }
}