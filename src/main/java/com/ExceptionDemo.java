package com;

import java.rmi.RemoteException;

/**
 * Create By Bridge On 2017/8/14
 * Function:
 * Description: Throwable类中的方法
 */
public class ExceptionDemo extends Throwable {

  /*  public String getMessage(){
        return null;
    }*/

    /**
     * 返回关于发生的异常的详细信息。
     * @return
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    /**
     * 返回一个Throwable 对象代表异常原因
     * @return
     */
    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    /**
     * 使用getMessage()的结果返回类的串级名字。
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 打印toString()结果和栈层次到System.err，即错误输出流。
     */
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    /**
     * 返回一个包含堆栈层次的数组。下标为0的元素代表栈顶，最后一个元素代表方法调用堆栈的栈底。
     * @return
     */
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    /**
     * 用当前的调用栈层次填充Throwable 对象栈层次，添加到栈层次任何先前信息中
     * @return
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }


    public ExceptionDemo() {
    }

    public static void main(String[] args){

        /**
         * Catch 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，
         * try 后面的 catch 块就会被检查。
         * 如果发生的异常包含在 catch 块中，异常会被传递到该 catch 块，
         * 这和传递一个参数到方法是一样。
         */
        int[] a = new int[2];
        try {
            System.out.println("Access array three: " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Exception thrown  :" + e);
        }finally {
            System.out.println("finally 被执行了。");
            a[0] = 6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("Out of the block");
    }

    /**
     * try{
     // 程序代码
     }catch(异常类型1 异常的变量名1){
     // 程序代码
     }catch(异常类型2 异常的变量名2){
     // 程序代码
     }catch(异常类型2 异常的变量名2){
     // 程序代码
     }
     */

    public void deposit(double amount) throws RemoteException {

        throw new RemoteException();
    }
}
