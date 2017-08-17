package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/17
 * Function: 使用泛型方法打印不同字符串的元素
 * Description: 泛型方法Demo
 */
public class GenericMethodTest {

    /**
     * 比较三个数的最大值
     * @param x
     * @param y
     * @param z
     * @param <T>
     * @return max
     */
    public static <T extends Comparable<T>> T max(T x, T y,T z){
        T max = x;
        if (y.compareTo(max)>0){//y更大
            max = y;
        }
        if (z.compareTo(max)>0){//y更大
            max = z;
        }
        return max;
    }

    /**
     *
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArray(E[] inputArray){

        //输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组

        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, max( 15, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, max( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", max( "pear", "apple", "orange" ) );

        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(216);

        getData(name);
        getData(age);
        getData(number);
    }

    private static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}
