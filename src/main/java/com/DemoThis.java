package com;

/**
 * Create By Bridge On 2017/8/14
 * Function:
 * Description:
 */
public class DemoThis {

    private String name;
    private int age;
    public DemoThis() {
        this.print();// 可以加上this来调用方法，
    }
    public DemoThis(String name, int age) {
        this.name = name;
        this.age = age;//这里就必须使用this加点的方法来区分，this.name就指代当前的属性name；
    }
    public void setName(String name) {
        this.name = name; // 此处必须指明你要引用成员变量
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Name=" + name + " Age=" + age); // 在此行中并不需要用this，
        // 因为没有会导致混淆的东西
    }
}
