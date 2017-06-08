package com.expertzlab.javatraining.hello;

/**
 * Created by gireeshbabu on 08/06/17.
 */
public class Hello {

    int i = 10;
    int j = 20;

    public static void main(String[] args) {
      System.out.println("Hello I am main");
      HelloSecond.mymethod();

    }
}

class HelloSecond{

    static Hello var = new Hello();

    public static void mymethod(){

        System.out.println("i = "+var.i);
        System.out.println("j = "+var.j);
    }

}
