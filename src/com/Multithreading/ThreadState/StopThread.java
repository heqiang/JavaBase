package com.Multithreading.ThreadState;


// 不要使用stop 或者destory等过时或者jdk不建议使用的方法
// 推荐线程自己停下来
public class StopThread implements Runnable{
    //设置一个标识符
    private  boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            i = i+1;
            System.out.println("run....Thread->"+i);
        }
    }

    //设置一个公开的方法停止线程，转换标志位
    public  void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        new  Thread(stopThread).start();
        for(int i =0;i<1000;i++){
            System.out.println("main->"+i);
            if (i==900){
                //只停止了当前线程 主线程还在跑
                stopThread.stop();
                System.out.println("线程停止了");
            }
        }
    }
}
