package com.expertzlab.javatraining.string;

/**
 * Created by gireeshbabu on 31/07/17.
 */
public class StrEqauls {

    public static void main(String[] args) {
        String s1  = "Hello1";
        String s2  = new String("Hello");
        System.out.printf("Are they same object ? - "+ (s1 == s2));
        System.out.println("\nAre they equal - "+s1.equals(s2));

    }
}
