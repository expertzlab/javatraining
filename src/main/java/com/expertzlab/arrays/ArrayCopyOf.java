package com.expertzlab.arrays;

import java.util.Arrays;

/**
 * Created by gireeshbabu on 26/07/17.
 */
public class ArrayCopyOf {

    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b;

        for(int i=0; i<4; i++){
            a[i] = 5;
        }

        b = Arrays.copyOf(a,4);

        a[2] = 10;
        System.out.println("A values:");
        for(int i=0; i<4; i++){
            System.out.print(", "+a[i]);
        }
        System.out.println("\nB values");
        for(int i=0; i<4; i++){
            System.out.print(", "+b[i]);
        }
    }
}
