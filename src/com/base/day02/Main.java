package com.base.day02;

public class Main {

    public static void main(String[] args) {
//        long  result = fun(5);
//        System.out.println(result);
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println();//换行
            }
        }
    }

    public static long fun(long num) {
        int result = 1;
        for(long i=1;i<num;i++){
            result*=i;
        }
        return result;
    }
}
