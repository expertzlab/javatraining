package com.expertzlab.javatraining.string;

/**
 * Created by gireeshbabu on 31/07/17.
 */
public class StringFormat {

    public static void main(String[] args) {
        String name = "Expertzlab";
        int distance = 25;
        String place = "Palarivattam";

        String formatted = String.format("Name:%.4s, distance:%04d, place:%s",name,distance,place);
        System.out.println(formatted);
    }
}
