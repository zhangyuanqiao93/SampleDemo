package com;

/**
 * Create By Bridge On 2017/8/11
 * Function: FinalizationDemo
 * Description: FinalizationDemo
 */


public class FinalizationDemo {

    public static void main(String[] args) {
        Cake cake1 = new Cake(1);
        Cake cake2 = new Cake(2);
        Cake cake3 = new Cake(3);

        cake2 = cake3 = null;
        System.gc(); //调用Java垃圾收集器
    }
}
    /**
     *  Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，
     *  这个方法叫做 finalize( )，它用来清除回收对象。
     *  关键字：protected 确保该方法不会被该类以外的类使用
     *  Java 的内存回收可以由 JVM 来自动完成。如果你手动使用，则可以使用下面的方法。
     */

    class Cake extends Object{
        private int id;
        public Cake(int id){
            this.id = id;
            System.out.println("Cake Object " + id + " is created");
            System.out.println("Cake Object " + id + " is created");
        }

        protected  void finalize() throws java.lang.Throwable {
            // 在这里终结代码
            super.finalize();
            System.out.println("Cake Object " + id + " is disposed");
            //System.out.println("Cake Object "  + " is disposed");
        }
}
