package com.base.day02;

public class BaseCat {

    /*
     * static 类变量(静态变量)
     *
     */
    static final double Num = 20;

    public static void main(String[] args) {
        // ++a 和a++ 前者是先赋值 在自增  后者是先自增后赋值
        int a = 5;
        int c = 5;
//        System.out.println(a++);
//        System.out.println(++c);
        //向左移 4位 5乘以2的4次方
        //右移  4位  5除以2的4次方
//        System.out.println(5<<4);
        // x?y:z x为true 结果为y 否则为z
        int z = 5 > 8 ? 2 : 3;
        System.out.println(z);


    }


}
