package com.base.day02.extendsclass;

public class Cat extends Animal {
    public  void  eat(){
        super.name = "Cat";
        System.out.println(name+"正在吃");
    }
    public  void  bark(){
        System.out.println(name+"在吠");
    }
    public  int num(){
        return 1;
    }
}
