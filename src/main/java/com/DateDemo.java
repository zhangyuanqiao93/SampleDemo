package com;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Create By Bridge On 2017/8/8
 * Function:
 * Description:
 */
public class DateDemo {


        public static void main(String[] args){
            Date date = new Date();
            String mDate = date.toString();
            System.out.println(mDate);
            System.out.println(date.getTime());
            System.out.println("date.getDay(): "+ date.getDay());
            System.out.println("date.getHours(): " + date.getHours());
            System.out.println("date.getMinutes(): " + date.getMinutes());

            SimpleDateFormat sf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
            System.out.println("mDate； " + sf.format(date));

            //c的使用
            System.out.printf("全部日期和时间信息：%tc%n",date);
            //f的使用
            System.out.printf("年-月-日格式：%tF%n",date);
            //d的使用
            System.out.printf("月/日/年格式：%tD%n",date);
            //r的使用
            System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
            //t的使用
            System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
            //R的使用
            System.out.printf("HH:MM格式（24时制）：%tR",date);

            //显示格式化时间
            System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
            System.out.println("\n");

            //java 8 Date
            LocalDate today = LocalDate.now();
            System.out.println("today； "+ today);
            System.out.println("\n");
            LocalTime now = LocalTime.now();
            System.out.println("Now"+ now);

            System.out.println("今天是：" + today.getYear()+ "年");
            System.out.println("今天是：" + today.getMonth()+ "月");
            System.out.println("今天是：" + today.getDayOfMonth()+ "月");
            System.out.println("今天是星期：" + today.getDayOfWeek());

            /**
             * Java 8 r日期和时间类Demo
             *
             */

            //判断今天是不是生日
            LocalDate dateOfBirth = LocalDate.of(1997,8,8);
            LocalDate day = LocalDate.now();
            MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(),dateOfBirth.getDayOfMonth());

            MonthDay currentMonthDay = MonthDay.from(day);
            if (currentMonthDay.equals(birthday)){

                System.out.println("今天是你的生日。");

            }else {
                System.out.println("今天不是你的生日。");
            }

            /**
             * 如何获取一周后的日期
             */
            LocalDate localDate = LocalDate.now();
            System.out.println("今天的日期是： "+ localDate);
            LocalDate oneToDay = localDate.plus(2, ChronoUnit.WEEKS); //+2 weeks
            System.out.println("一周后的时间是： "+ oneToDay);

            oneToDay = localDate.plus(2, ChronoUnit.YEARS); //+2 years
            System.out.println("ChronoUnit.YEARS： "+ oneToDay);

            System.out.printf("%s 是否是闰年：%s",localDate,localDate.isLeapYear());

            System.out.println("\n");
            //在java8中获取当前时间戳
            Instant timestamp = Instant.now();
            System.out.println("当前的时间戳是： " + timestamp);
        }
}
