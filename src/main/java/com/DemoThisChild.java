package com;

/**
 * Create By Bridge On 2017/8/14
 * Function:
 * Description:
 */
public class DemoThisChild extends DemoThis {

    //重载1
    public DemoThisChild(String name, int age) {
        super(name, age);
    }
    //重载2
    public DemoThisChild() {
    }


    @Override //重写父类的方法，只能改变方法体，即实现逻辑
    public void print() {
        super.print();
        System.out.println("嘿嘿嘿。。。");

    }
}
