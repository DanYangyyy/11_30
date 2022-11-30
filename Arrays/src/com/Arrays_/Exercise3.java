package com.Arrays_;

import javax.print.attribute.standard.PrinterName;

public class Exercise3 {
    public static void main(String[] args) {
        String name="Yang Xiao Dan";//Dan,Yang.
        PrintName(name);

    }

    public static void PrintName(String name){
        if(name==null){
            System.out.println("输入非法");
            return ;
        }
        String[] s = name.split(" ");
        if(s.length!=3){
            System.out.println("输入字符串格式不正确");
            return ;
        }
        String format = String.format("%s,%s.%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
