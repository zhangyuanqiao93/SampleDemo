package com;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create By Bridge On 2017/8/8
 * Function:
 * Description:
 */
public class SleepDemo {

    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args){

        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date()  + "\n");
            Thread.sleep(5*30*10);//休眠三秒

            long end = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            long ex = end - start;

            System.out.println( "Difference is :" + ex);
            Pattern pattern = Pattern.compile(REGEX);

            //matcher对象的获取
            Matcher m = pattern.matcher(INPUT);
            StringBuffer sb = new StringBuffer();
            while (m.find()){

                m.appendReplacement(sb,REPLACE);

            }
            m.appendTail(sb);
            System.out.println(sb.toString());




        } catch (InterruptedException e) {
            System.out.println("线程不安全");
        }

    }
}
