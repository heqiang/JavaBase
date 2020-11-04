package com.base.day02.abstract_implements;

public class AbstractMain {

    public static void main(String[] args) {
         AbstractDemo abstractDemo = new AbstractDemo("hq",22,"男");
         abstractDemo.setAge(18);
         int age = abstractDemo.getAge();
        System.out.println(age);
    }
}
