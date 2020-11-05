package com.Multithreading;

//创建线程的方式一:继承Thread类 重写run()方法 ，调用start方法开启线程
/*
* 总结：线程开始不一定立即执行，由cpu安排调度
*
* */
public class MakeThread extends Thread {
        public void  run(){
            for (int i=0;i<20;i++){
                System.out.println("看代码");
            }
        }

    public static void main(String[] args) {
        MakeThread makeThread = new MakeThread();
        makeThread.start();
        for (int i=0;i<1000;i++){
            System.out.println("学习"+i);
        }
    }
}
