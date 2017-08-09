package com;

import java.util.StringTokenizer;

/**
 * Created by Bridge on 2017/7/21.
 */
public class EnvDemo {
    public static void main(String[] argv){
        System.out.println("System.getEnv(\"PATH\") = " + System.getenv("PATH"));

        System.out.println(System.getProperty("pencil_color"));

        if (argv.length==0){
            System.getProperties().list(System.out);
        }else {
            for (String s : argv){
                System.out.println(s + "="+ System.getProperty(s));
            }
        }

        String a = "java is great.";

        System.out.println(a.substring(5));
        StringTokenizer stringTokenizer = new StringTokenizer("Hello, World|of|Java",", |",true);

        while (stringTokenizer.hasMoreElements()){
            System.out.println("Token: " + stringTokenizer.nextElement());
        }
    }


}
