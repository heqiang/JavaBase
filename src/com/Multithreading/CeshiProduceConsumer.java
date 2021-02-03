package com.Multithreading;

public class CeshiProduceConsumer {
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        new Produce(synContainer).start();
        new Consumer(synContainer).start();
    }

}

//生产者
class Produce extends Thread {
    SynContainer synContainer;

    public Produce(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("生产了" + i + "只鸡");
            synContainer.push(new Chicken(i));
        }
    }
}

//消费者
class Consumer extends Thread {
    SynContainer synContainer;

    public Consumer(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("消费了第" + synContainer.pop().num + "只鸡");
        }
    }
}

//定义产品
class Chicken {
    int num;

    public Chicken(int num) {
        this.num = num;
    }
}

//缓冲区
class SynContainer {
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    public synchronized void push(Chicken chicken) {
        if (count == chickens.length) {
            //通知可以消费了
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chickens[count] = chicken;
        count++;
        this.notifyAll();
    }

    public synchronized Chicken pop() {
        if (count <= 0) {
            //通知可以生产了
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Chicken chicken1 = chickens[count];
        this.notifyAll();
        return chicken1;
    }
}



