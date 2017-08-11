package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create By Bridge On 2017/8/11
 * Function:
 * Description:
 */
public class BRRead {

    public static void main(String args[]) throws IOException {

        char c;
        String str;

        //JDK 5 以后使用ScannerDemo类来获取控制台的输入。

        //使用System.in创建一个BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       /* do {
            *//**
             * 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。
             * 当流结束的时候返回 -1。该方法抛出 IOException。
             *//*
            c = (char) br.read();
            System.out.println(c);
        }while (c != 'q');*/


        //System.out.println("输入字符，按下'q'退出。");
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
        }while (str.equals("end"));



    }

}
