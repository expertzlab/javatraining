package com.expertzlab.javatraining.shapes;

/**
 * Created by gireeshbabu on 21/11/16.
 */
public class Rectangle {// extends Shape implements Rotatable {
    private int length, height;

    public Rectangle(int l, int h) {
        length = l;
        height = h; }
      public double area() { return length * height;
    }

    //@Override
    public void rotate(float degree) {
    }
}