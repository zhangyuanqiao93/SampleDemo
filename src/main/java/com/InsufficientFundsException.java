package com;

/**
 * Create By Bridge On 2017/8/14
 * Function:
 * Description: 实例:一个银行账户的模拟，通过银行卡的号码完成识别，可以进行存钱和取钱的操作。
 */


public class InsufficientFundsException extends Exception {

    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}
