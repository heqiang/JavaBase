package com.Multithreading.ThreadState;

public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("***********");
        });
        // 观察状态
        Thread.State  state = thread.getState();
        System.out.println("线程的状态："+state);

        //观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);

        while (state!=Thread.State.TERMINATED){
            Thread.sleep(1000);
            //更新线程的状态
            state = thread.getState();
            System.out.println(state);

        }
    }
}

