package com.expertzlab.javatraining.overloading;

/**
 * Created by gireeshbabu on 25/07/17.
 */
public class Overloading {

    public static void main(String[] args) {
            fun(10.5f,25);
    }

    /*
    public static void fun(int x){
        System.out.println("Integer X");
    }

    public static void fun(float x){
        System.out.println("Float X");
    }

    public static  void fun(int x, float y){
        System.out.println("int first and float second");
    }

    public static void fun(float x, int y){
        System.out.println("Float first and int second");

    }
    */

    public static void fun(int x, float y){
        System.out.println("Integer X");
    }
    public static void fun(float z, int k){
        System.out.println("Integer X");
    }


}
