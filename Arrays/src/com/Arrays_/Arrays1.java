package com.Arrays_;

import java.util.Arrays;
import java.util.List;

public class Arrays1 {
    public static void main(String[] args) {
        Integer[] i={1,2,3};
        System.out.println(Arrays.toString(i));

        Integer[] j={3,2,5,8,1};
        Arrays.sort(j);
        System.out.println(Arrays.toString(j));

        int index=Arrays.binarySearch(j,8);
        System.out.println(index);

        Integer[] newarr=Arrays.copyOf(j,j.length+1);
        System.out.println(Arrays.toString(newarr));

        Integer[] num=new Integer[]{1,2,3};
        Arrays.fill(num,666);
        System.out.println(Arrays.toString(num));

        List asList=Arrays.asList(1,2,3);
        System.out.println("asList="+asList);
        System.out.println("运行类型"+asList.getClass());

    }
}
