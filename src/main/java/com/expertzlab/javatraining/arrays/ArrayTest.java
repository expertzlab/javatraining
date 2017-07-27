package com.expertzlab.javatraining.arrays;

/**
 * Created by gireeshbabu on 26/07/17.
 */
public class ArrayTest {

    static int i = 10;
    static int[] a;

    public static void main(String[] args) {


        a = new int[10];
        for(int i=0; i<10 ; i++){
            a[i] = 1;
        }

        int[] b = a;
        b[5] = 2;

        for(int i=0; i<10 ; i++){
             System.out.print(", "+a[i]);
        }

        System.out.println("");
       for(int i=0; i<10 ; i++){
            System.out.print(", "+b[i]);
        }

    }

    public static void another(){
        int i;
    }
}
