package com.Multithreading.ProducersAndConsumers;


//线程通信
/*
 * 生产者消费者模式 是一个问题不是一种设计模式
 *  生产消费者模型 -》 利用缓冲区解决：管程法
 * */
public class ProducersAndConsumers {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Produce(container).start();
        new Consumer(container).start();

    }
}


class Produce extends Thread {
    SynContainer synContainer;

    public Produce(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synContainer.push(new Chicken(i));
            System.out.println("生产了-》" + i + "只鸡");
        }

    }
}

class Consumer extends Thread {
    SynContainer synContainer;

    public Consumer(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了第-》" + synContainer.pop().id + "只鸡");
        }
    }
}


class Chicken {
    int id;

    public Chicken(int num) {
        this.id = num;
    }
}

//缓冲区
class SynContainer {
    //定义容器大小
    Chicken[] chickens = new Chicken[10];
    //
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken) {
        if (count == chickens.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 没有满 就需要丢入产品
        chickens[count] = chicken;
        count++;
        this.notifyAll();
    }

    //消费者消费产品
    public synchronized Chicken pop() {
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果可以消费
        count--;
        Chicken chicken = chickens[count];
        //吃完了通知生产者生产
        this.notifyAll();
        return chicken;
    }
}