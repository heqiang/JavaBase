package com.base.day03.sorting;

public class BubbleSort {
    public static void main(String[] args) {
         int[] a = {0,1,48,3,9,7,2};
         sort(a);
         printArray(a);

    }
    //冒泡排序 从大到小
    public static  void  sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1;j++){
                if (array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static  void  printArray(int[] array){
        for(int x:array){
            System.out.println(x);
        }
    }
}
