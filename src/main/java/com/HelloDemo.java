package com;

/**
 * Created by Bridge on 2017/7/22.
 */

public class HelloDemo {
    public static void main(String[] args) {

        int sum = 0; // 保存 1-50 之间偶数的和

        int num = 2; // 代表 1-50 之间的偶数

        do {
            //实现累加求和
            sum = num +sum;

            num = num + 2; // 每执行一次将数值加2，以进行下次循环条件判断

           }
           while ( num <=50) ;
        // 满足数值在 1-50 之间时重复执行循环

        System.out.println(" 50以内的偶数之和为：" + sum );

        int sum11=0;
        int i=1;
        do{
            sum11+=i;
            i++;
        } while (i<=100);
        System.out.println("1到100之间所有整数的和是: "+sum);
    }

    StringDemo stringDemo = new StringDemo();

    public void setStringDemo(StringDemo stringDemo) {
        this.stringDemo = stringDemo;
    }

}