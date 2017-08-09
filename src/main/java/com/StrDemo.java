package com;

/**
 * Create By Bridge On 2017/8/7
 * Function:
 * Description:
 */
public class StrDemo {

    public static void main(String[] args){

        String site = "www.bridge.com";
        int len = site.length();
        System.out.println("我的网站长度是： " + len);
        //concat连接字符串
        System.out.println("百度的网址是：".concat("www.baidu.com"));
        System.out.println("百度的网址的长度是：".concat(String.valueOf(len)));

        char result = site.charAt(6);//返回指定索引处的字符
        System.out.println(result);


        String str1 = "string";
        String str2 = "String";
        String str3 = "String123456";
        StringBuffer sb = new StringBuffer("String");

        int res = str1.compareTo(str2);
        System.out.println(res);//返回0，表示相等


        res = str2.compareTo(str3);
        System.out.println(res);//小于0，表示第一个比第二个小

        res = str3.compareTo(str1);
        System.out.println(res); //大于0，表示第一个大于第二个

        boolean b = str1.contentEquals(sb);
        System.out.println(b);//false

        b = str2.contentEquals(sb);
        System.out.println(b);//true


    }
}
