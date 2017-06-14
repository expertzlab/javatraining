package com.expertzlab.javatraining.hello;

import java.util.Scanner;

/**
 * Created by gireeshbabu on 08/06/17.
 */
public class Hello {

  public static void main(String[] v){

      System.out.println("calling calculate");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value:");
      byte x = sc.nextByte();
      System.out.println("Enter a new value:");
      byte y = sc.nextByte();
      byte sum = calculateSum(x,y);
      System.out.println("Sum = " + sum);
  }

  static byte calculateSum(byte a, byte b){
        System.out.printf("We received x - %d, y - %d\n",a,b);
        byte sum = (byte) (a + b);
        return sum;
  }

}
