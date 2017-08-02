package com.expertzlab.javatraining.objects;

/**
 * Created by gireeshbabu on 01/08/17.
 */
public class Point {

    int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("Point:x=%d,y=%d",x,y);
    }
}
