package com.base.day03.ExecptionClass;

public class MyException extends Exception {

    //传递数字>10
    public int detail;

    public MyException(int a) {
        this.detail = a;
    }

    //异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}