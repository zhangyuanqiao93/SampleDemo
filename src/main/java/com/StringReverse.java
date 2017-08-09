package com;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Bridge on 2017/7/21.
 */
public class StringReverse {
    public static void main(String[] args){
        test();
    }

    public static void test(){
        String s = " Father Charles Goes Down And Ends Battle";

        String str = "FRGCVASDSA";
        System.out.println(str + " --> "+ new StringBuffer(str).reverse());

        //将单词从前往后压入栈
        Stack<String> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            myStack.push(st.nextToken());
        }
        System.out.println('"' +  s + '"' + "Backwards by words is:\n\t\"");
        while (!myStack.empty()){
            System.out.print(myStack.pop());
            System.out.print(' ');
        }
        System.out.println('"');
    }
}
