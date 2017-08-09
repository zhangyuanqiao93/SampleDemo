package com;

public class StringDemo {

    String str1 = "ab";
    String str2 = "c";

    public  String strDemo(){
        System.out.println(str1+str2);
        StringBuilder stringBuilder = new StringBuilder("abc");

        return stringBuilder.toString();
    }
}
