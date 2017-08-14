package com;

/**
 * Create By Bridge On 2017/8/14
 * Function:
 * Description:
 */

//此类模拟银行账户
public class CheckingAccount {

    //balance 余额，number是卡号
    private double balance;

    private int number;

    public CheckingAccount() {

    }

    //方法：存钱
    public void deposit(double amount)
    {
        balance += amount;
    }
    //方法：取钱
    public void withdraw(double amount) throws
            InsufficientFundsException
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CheckingAccount(int number){
        this.number = number;

    }
}
