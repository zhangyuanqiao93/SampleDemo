package com;

//定义抽象类
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    /**
     * 抽象方法不能加方法体，只能在子类继承时实现方法体
     */
    public abstract double computerPay();
}
