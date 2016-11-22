package com.expertzlab.javatraining.shapes;

/**
 * Created by gireeshbabu on 21/11/16.
 */
public class Circle extends ShapeBase implements Rollable {
    private int xPos, yPos, radius;
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }
    public double area() { return Math.PI * radius * radius; } @Override
    public void roll(float degree) {
        // implement rolling functionality here
    }
    public static void main(String[] s) {
        Circle circle = new Circle(10,10,20);
        circle.roll(45);
    } }