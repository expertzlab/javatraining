package com.expertzlab.javatraining.arrays;

import java.util.Arrays;

/**
 * Created by gireeshbabu on 26/07/17.
 */
public class ArraySystemCopy {

    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[4];

        for(int i=0; i<4; i++){
            a[i] = 5;
        }

        for(int i=0; i<4; i++){
            b[i] = 15;
        }


        int[] temp = new int[8];
        System.arraycopy(a,0,temp,0,4);
        System.arraycopy(b,0,temp,4,4);

        a = temp;

        System.out.println("A values:");

        for(int i=0; i < a.length; i++){
            System.out.print(", "+a[i]);
        }

    }
}
