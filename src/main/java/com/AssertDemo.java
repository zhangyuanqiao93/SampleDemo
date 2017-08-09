package com;

/**
 * Created by Bridge on 2017/7/21.
 */
public class AssertDemo {

    public static void main(String[] args){

        int i = 4;
        if (args.length == 1){
            i = Integer.parseInt(args[0]);
        }
        assert i > 0:"i is non-positive";
        System.out.println("Hello Java");
        test();
    }

    public static void test(){
        StringBuffer sb = new StringBuffer();
        for (char c = 'a';c < 'd';c++){
            sb.append(c);
        }
        sb.append('\u00a5');
        sb.append('\u01fc');
        sb.append('\u0391');
        sb.append('\u00a5');

        for (int i = 0;i<sb.length();i++){
            System.out.printf("Character #%d (%04x) is %c%n",i,(int)sb.charAt(i),sb.charAt(i));
        }

        System.out.println("Accumulated character are " + sb);
    }

}
