package com;

import java.util.*;

/**
 * Create By Bridge On 2017/8/17
 * Function:  入栈出栈的Demo，先进后出（LIFO）,Stack类是属于Vector的一个子类
 * Description: StackDemo
 */
public class StackDemo {

    static void showPush(Stack<Integer> stack, int a){

        stack.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
    }

    static void showPop(Stack<Integer> stack){

        System.out.println("Pop--->");
        Integer a = stack.pop();
        System.out.println(a);
        System.out.println("Pop： "+ stack);
    }
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();//声明为泛型
        System.out.println("Stack: "+ stack);

       showPush(stack,42);
       showPush(stack,66);
       showPush(stack,99);

       showPop(stack);
       showPop(stack);
       showPop(stack);

       try {
           showPop(stack);
       }catch (EmptyStackException e){
           System.out.println("Empty Stack!");
       }
    }
}
