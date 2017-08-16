package com;

/**
 * Create By Bridge On 2017/8/16
 * Function: RunEncap
 * Description:
 */
public class RunEncap {


    public static void main(String[] args){
        Person person = new Person();
        person.setName("Bridge");
        person.setAge(22);

        System.out.println("Name:" +person.getName()+ ","+
                "Age:" +person.getAge());
    }
}
