package com.base.day02.abstract_implements;

public class AbstractDemo extends AbstractClass {
    public  String sex;

    public  AbstractDemo(String name,int age,String sex){
        super(name, age);
        this.sex=sex;
    }

    public  int getAge(){
        return  age;
    }
    public  void  setAge(int newage){
         if (age>0){
              this.age = newage;
         }
    }

}
