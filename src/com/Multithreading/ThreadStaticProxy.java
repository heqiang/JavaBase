package com.Multithreading;

//静态代理模式总结;
// 真实对象与代理对象都要同时实现统一接口
//代理对象要代理真实角色

public class ThreadStaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new Me());
        weddingCompany.HappyMarry();
    }
}

interface Marry {
    //人生四大喜事 : 他乡遇故知 久旱逢甘霖 洞房花烛夜 金榜题名时

    void HappyMarry();
}

class Me implements Marry {

    @Override
    public void HappyMarry() {
        System.out.println("结婚了 super开心");
    }
}

class WeddingCompany implements Marry {
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void before() {
        System.out.println("结婚前,布置场景");
    }

    private void after() {
        System.out.println("结婚后，收尾款");
    }
}