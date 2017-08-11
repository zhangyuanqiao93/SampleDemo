package com;

/**
 * Create By Bridge On 2017/8/11
 * Function:  可变参数的方法
 * Description:  // 调用可变参数的方法
 */
public class VarargsDemo {

    public static void printMax(double ... numbers){

        if (numbers.length == 0 ){

            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 0;i<numbers.length;i++){

            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    public static void main(String[] args){

        // 调用可变参数的方法
        printMax(2,6,45.6,39,22.00);
        printMax(1,2,3);
        printMax(new double[]{1,2,3});
    }
}
