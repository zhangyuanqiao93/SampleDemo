package com;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Create By Bridge On 2017/8/17
 * Function: Vector类实现了一个动态数组。和ArrayList和相似，但是两者是不同的：
 * Description:
 */
public class VectorDemo {

    public VectorDemo(){}


    public void vectorTest(){
        Vector<Integer> vector = new Vector<>();
        Integer integer = 1;
        vector.addElement(integer);
        int size = vector.size();//返回此向量中的组件数。
        int capacity = vector.capacity();//获取动态数组中的容量，返回此向量的当前容量。
    }

    public static void main(String args[]) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " +
                v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " +
                v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " +
                (Integer)v.firstElement());
        System.out.println("Last element: " +
                (Integer)v.lastElement());
        if(v.contains(new Integer(3)))
            System.out.println("Vector contains 3.");
        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();//枚举类型
        System.out.println("\nElements in vector:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
