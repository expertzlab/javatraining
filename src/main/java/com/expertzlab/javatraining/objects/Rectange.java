package com.expertzlab.javatraining.objects;

/**
 * Created by gireeshbabu on 01/08/17.
 */
public class Rectange {

    private Point p;
    private int width;
    private int height;

    public Rectange(Point p, int w, int h){
        this.p = p;
        width = w;
        height = h;
    }

    public void printRectangle(){
        System.out.println(p);
        System.out.printf("Rectange:width=%d,height=%d", width,height);
    }
}
