package com;

public class Salary extends Employee {
    private double salary;
    @Override
    public double computerPay() {
        System.out.println("Salary 继承了 Employee,并且实现了其抽象方法" + getName());
        return salary/52; //每年52个星期
    }
}
