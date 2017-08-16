package com;

/**
 * Create By Bridge On 2017/8/16
 * Function:
 * Description: java 封装demo
 */

//public方法是外部类访问该类成员变量的入口。
public class Person {
    /**
     *  封装的步骤：
     *  1.修改属性的可见性来限制对属性的访问（一般限制为private）；
     *  2.对每个值属性提供对外的公共方法访问，
     *  也就是创建一对赋取值方法，用于对私有属性的访问；
     *
     */


    private String  name;
    private int age;


    //getter和setter方法。
    //提供对外的访问接口
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
