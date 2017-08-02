package com.expertzlab.javatraining.objects;

/**
 * Created by gireeshbabu on 01/08/17.
 */
public class RunRectangle {

    public static void main(String[] args) {

        Point p = new Point(200, 100);
        Rectange rect = new Rectange(p,300,400);
        rect.printRectangle();
    }
}
