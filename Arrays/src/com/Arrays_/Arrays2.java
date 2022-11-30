package com.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays2 {
    public static void main(String[] args) {
        int[] arr={2,1,4,8,3,0,-5};
        System.out.println("=====");
        bubble1(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        bubble2(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer) o1;
                int i2=(Integer) o2;
                return i2-i1;
            }
        });
        System.out.println("==========");
        System.out.println(Arrays.toString(arr));
    }
    //使用冒泡排序
    public static void bubble1(int[] arr){
        int tmp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
            }
        }
        }
    }
    //使用冒泡排序+定制
    public static void bubble2(int[] arr, Comparator c){
        int tmp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(c.compare(arr[j],arr[j+1])>0){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
