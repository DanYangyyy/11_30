package com.Arrays_;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //abcdef-->aedcbf
        String str="abcdef";
        System.out.println("交换前");
        System.out.println(str);
        String newstr= null;
        try {
            newstr = reverse(str,1,3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ;
        }
        System.out.println("交换后");
        System.out.println(newstr);

    }

    public static String reverse(String str, int start, int end) {
        if(!(str!=null&&start>=0&&end<str.length()&&start<end)){
            throw new RuntimeException("输入非法");
        }
        char[] chars = str.toCharArray();
        char tmp=' ';
        for(int i=start,j=end;i<j;i++,j--){
            tmp=chars[i];
            chars[i]=chars[j];
            chars[j]=tmp;
        }
        return new String(chars);
    }
}
