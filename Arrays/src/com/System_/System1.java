package com.System_;

import java.util.Arrays;

public class System1 {
    public static void main(String[] args) {
//        System.out.println("hello1");
//        System.exit(0);
//        System.out.println("hello2");

        int[] src={1,2,3};
        int[] dest=new int[3];
        System.arraycopy(src,0,dest,1,2);
        System.out.println(Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
    }
}
