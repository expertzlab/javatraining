package com.expertzlab.javatraining.hello;

import java.util.Scanner;

/**
 * Created by gireeshbabu on 08/06/17.
 */
public class Hello {

    int a = 15;

  public static void main(String[] v){

      System.out.println("calling calculate");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value:");
      int x = sc.nextInt();
      System.out.println("Enter a new value:");
      int y = sc.nextInt();
      int sum = calculateSum(x,y);
      System.out.println("Sum = " + sum);
  }

  static int calculateSum(int a, int b){
        System.out.printf("We received x - %d, y - %d\n",a,b);
        return a+b;
  }

}
