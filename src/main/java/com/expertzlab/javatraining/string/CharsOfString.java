package com.expertzlab.javatraining.string;

/**
 * Created by gireeshbabu on 27/07/17.
 */
public class CharsOfString {
    public static void main(String[] args) {
        String str = new String("banana");
        for(int i=0; i<str.length(); i++){
            byte ch = (byte) str.charAt(i);
            System.out.print(ch);
        }
    }
}
