package com.base.day03;

public class StaticClass {
    public static String name = "hq";

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.test2();
        System.out.println(staticClass.name);
    }

    public static void test1() {

    }

    public void test2() {
        test1();
        System.out.printf(this.name);
    }

}
