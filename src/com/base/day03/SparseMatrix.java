package com.base.day03;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] a = new int[11][11];
        a[2][3] = 3;
        a[1][5] = 5;
        int avialdNum = getNum(a);
        //创建一个稀疏矩阵
        int[][] b = new int[avialdNum + 1][3];
        b[0][0] = 11;
        b[0][1] = 11;
        b[0][2] = avialdNum;
        sparseMatrix(a, b);
        printMatrix(b);
        int[][] c = new int[b[0][0]][b[0][1] = 11];
        original(b, c);
        for (int[] ints : c) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    // 获取矩阵的有效个数
    public static int getNum(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    // 填充稀疏矩阵
    public static void sparseMatrix(int[][] array, int[][] b) {
        int count = 0;
        for (int x = 0; x < array.length; x++) {
            for (int j = 0; j < array[x].length; j++) {
                if (array[x][j] != 0) {
                    count++;
                    b[count][0] = x;
                    b[count][1] = j;
                    b[count][2] = array[x][j];
                }
            }
        }
    }

    //输出稀疏矩阵
    public static void printMatrix(int[][] a) {
        for (int[] ints : a) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    System.out.print(anInt + "\t");
                }
            }
            System.out.println();
        }
    }

    // 稀疏矩阵还原
    public static void original(int[][] b, int[][] c) {
        for (int i = 1; i < b.length; i++) {
            c[b[i][0]][b[i][1]] = b[i][2];
        }
    }

}
