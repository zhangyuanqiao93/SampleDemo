package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Random;


/**
 * Create By Bridge On 2017/8/30
 * Function: 《阿里巴巴java开发手册》笔记
 * Description: java开发注释正确的使用测试类
 */
public class AlibabaDemo {

    /*Logger日志处理框架*/
    private static final Logger logger = LoggerFactory.getLogger(AlibabaDemo.class);


    public static void main(String[] args) {
        //返回的是一个double类型的值，0<= x <1,注意除0异常
        double random = Math.random();
        //System.out.println(random);
        /*注意：在使用取整时，调用Random对象的nextInt() or nextLong()方法*/
        try {
            Random random1 = new Random();
            logger.info("random1");

        }catch (Exception e){
            //必须对异常进行处理
        }
        //System.out.println( random1.nextInt());
        //System.out.println( random1.nextLong());

        /*Java 8 Time 类型*/
        Instant now = Instant.now();
        long l = System.currentTimeMillis();//ms
        System.out.println(l);
        System.out.println(now);

        Object obj = null;
        if (null != obj){

        }

        Animal1 animal = new Animal1();
        if (animal != null){

        }
    }
}
