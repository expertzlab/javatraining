package com.expertzlab.javatraining.string;

/**
 * Created by gireeshbabu on 28/07/17.
 */
public class StringDetails {

    public static void main(String[] args) {
        String str = "Hello";

        String str1 =  new String( "Hello");
        str1 = str1.trim();

        System.out.println(str);
        System.out.println("hash code of str-"+str.hashCode());
        System.out.println(str1);
        System.out.println("has code of str1-"+str1.hashCode());

    }
}
