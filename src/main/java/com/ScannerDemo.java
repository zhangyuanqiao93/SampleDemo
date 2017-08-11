package com;

import java.util.Scanner;

/**
 * Create By Bridge On 2017/8/11
 * Function:
 * Description:
 */
public class ScannerDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //System.in=null

        double sum = 0;
        int m = 0;

        while(scan.hasNextDouble())
        {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));

       /* // 从键盘接收数据
        //next方式接收字符串
        while (scan.hasNext()){

            String str = scan.next();
            System.out.println(str);
        }

        int i = 0 ;
        float f = 0.0f ;
        System.out.print("输入整数：");
        if(scan.hasNextInt()){
            // 判断输入的是否是整数
            i = scan.nextInt() ;
            // 接收整数
            System.out.println("整数数据：" + i) ;
        }else{
            // 输入错误的信息
            System.out.println("输入的不是整数！") ;
        }
        System.out.print("输入小数：");
        if(scan.hasNextFloat()){
            // 判断输入的是否是小数
            f = scan.nextFloat() ;
            // 接收小数
            System.out.println("小数数据：" + f) ;
        }else{
            // 输入错误的信息
            System.out.println("输入的不是小数！") ;
        }
*/
    }
}
