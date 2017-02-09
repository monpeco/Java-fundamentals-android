package com.company;

/**
 * Created by M on 08-02-2017.
 */
public class MyOperators {
    static boolean f1(){
        System.out.println("f1 returns false");
        return false;
    }
    static boolean f2(){
        System.out.println("f2 returns true");
        return true;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        String str = "hi";
        String str2 = "bye";

        if(a==b) System.out.println("equals");
        if(a!=b) System.out.println("diff");
        if(a<b) System.out.println("lower");
        if(a<=b) System.out.println("lower or equals");
        if(a>b) System.out.println("greater");
        if(a>=b) System.out.println("greater or equals");

        System.out.println("Try &&");
        if(f1() && f2());

        System.out.println("Try &");
        if(f1() & f2());

        /*Output:
        diff
        lower
        lower or equals
        Try &&
        f1 returns false
        Try &
        f1 returns false
        f2 returns true
        * */
    }
}
