package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Create By Bridge On 2017/8/17
 * Function: // TODO: 2017/8/17  
 * Description: ctrl + j 会弹出很多快捷键的选择
 */
public class CollectionsDemo {

    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();

        map.put("Bridge","20");
        map.put("Anmy","22");
        map.put("Jonh","18");
        map.put("Pual","24");

        System.out.println();
        System.out.println("Map Elements: ");
        System.out.println("\t" + map);
        //快捷键 iter+tab
        for (String s : map.values()) {

        }
        // Iterate over a List,快捷键 itli+tab
      /*  for (int i = 0; i < list.size(); i++) {
            Object o =  list.get(i);
            
        }*/

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
    }
}
