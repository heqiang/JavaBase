package com.base.day02.extendsclass;

public class Dog extends Animal{
    public  void  eat(){
        super.name = "Dog";
        System.out.println(name+"正在吃");
    }
}
