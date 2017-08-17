package com;

/**
 * Create By Bridge On 2017/8/17
 * Function:
 * Description: 泛型类
 */
public class Box<T> {

    private T t;
    public void add(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<String> stringBox1 = new Box<>();
        stringBox1.add(new String("Code 码农"));

        integerBox.add(new Integer(10));
        stringBox.add(new String("java菜鸟"));

        System.out.printf("整型值为 :%d\n\n", integerBox.getT());
        System.out.printf("字符串为 :%s\n", stringBox.getT());
        System.out.printf("字符串为 :%s\n", stringBox1.getT());
    }
}
