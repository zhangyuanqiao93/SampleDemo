package com;

/**
 * Create By Bridge On 2017/8/16
 * Function:
 * Description: 实现接口，必须同时实现其所有的方法
 */
public class MammalInt implements Animal2 {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void travel() {
        System.out.println("travel");
    }

 public static void main(String[] args){

        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
 }
}
