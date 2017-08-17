package com;

import java.util.*;

/**
 * Create By Bridge On 2017/8/17
 * Function:
 * Description:
 */
public class ConnDemo {

    //快捷键，psvm + Tab
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");

        /**
         * Method 1: 普遍使用，二次取值
         */
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {//快捷键：iter+tab
            System.out.println("key =  " + key + " " + "and value = " + map.get(key));
        }

        /**
         * Method 2: 通过Map.entrySet使用iterator遍历key和value
         */
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry =  it.next();
            System.out.println("Key = " + entry.getKey()+ ";" + "Value = " + entry.getValue());
            
        }

        /**
         * Method 3：推荐，尤其是容量大时,通过Map.entrySet遍历key和value
         */
        System.out.println("通过Map.entrySet遍历key和value");//iter+tab
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey()+ ";" + "Value = " + entry.getValue());
        }
        /**
         * Method 4: 遍历所有的value，不遍历Key
         */
        for (String v : map.values()) {
            System.out.println("value = " + v);

        }

        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");

        /**
         * 方法一：使用foreach遍历list
         */
        for (String str:
             list) {
            System.out.println(str);
        }

        /**
         * 方法二：将链表变为数组相关的内容进行遍历。
         */
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String str: strArray) {
            System.out.println(str);
        }
        /* //or
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }*/

        /**
         * 方法三：迭代器
         */
        Iterator<String> iterator = list.iterator();

        /**
         * // TODO: 2017/8/17
         * 快捷键：itit+Tab
         */
        while (iterator.hasNext()) {//检查下一个元素之后的值
            String next =  iterator.next();
            System.out.println(next);
        }
    }
}
