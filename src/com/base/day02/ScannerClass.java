package com.base.day02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner  scanner = new Scanner(System.in);
        //求和
        double sum = 0;
        //计算输入的数字个数
        int num = 0;
        while (scanner.hasNextDouble()){
                double x = scanner.nextDouble();
                num+=1;
                sum = sum+x;

        }
        System.out.println(sum);
        System.out.println(sum/num);
        scanner.close();


    }
}
