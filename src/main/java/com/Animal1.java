package com;

/**
 * Create By Bridge On 2017/8/14
 * Function:
 * Description:
 */
public class Animal1 {

    private String name;
    private int age;
    //初始化属性值
    public Animal1(String myName, int age){
        this.age =  age;
        this.name = myName;
    }

    public Animal1(){
        this.eat();
        this.sleep();
    }

    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

