package com;

import java.util.StringTokenizer;

/**
 * Created by Bridge on 2017/7/21.
 */
public class StrTokDemo {

    public static void main(String[] args){
        process("Hello, Java|World|,");
    }

    public final static int MAXFIELDS = 5;
    public final static String DELIM = "|";

    /**
     * 处理一个字符串，将其作为一个字符串数组返回
     *
     */

    public static String[] process(String line){
        String[] result = new String[MAXFIELDS];

        StringTokenizer st = new StringTokenizer(line,DELIM,true);
        int i = 0;
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if (str.equals(DELIM)){
                if (i++>=MAXFIELDS) throw new IllegalArgumentException("Input line"+line+"has too many fields");
                    continue;
            }
            result[i] = str;
        }
        return result;
    }
}
