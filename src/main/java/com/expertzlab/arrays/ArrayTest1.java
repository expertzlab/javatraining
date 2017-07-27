package com.expertzlab.arrays;

/**
 * Created by gireeshbabu on 26/07/17.
 */
public class ArrayTest1 {




    public static void main(String[] args) {
        int[] a;
        a = new int[10];

        for(int i=0; i<10 ; i++){
            a[i] = 1;
        }

        System.out.println("before calling: another");
        for(int i=0; i<10 ; i++){
            System.out.print(", "+a[i]);
        }
        another(a);
        System.out.println("\nAfter calling: another");
        System.out.println("");
        for(int i=0; i<10 ; i++){
            System.out.print(", "+a[i]);
        }

    }

    public static void another(int[] x){

        System.out.println("\nIn another method");
        for(int i=0; i<10 ; i++){
            System.out.print(", "+x[i]);
        }
        x[5] = 6;
    }
}
