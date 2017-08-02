package com.expertzlab.javatraining.game;

/**
 * Created by gireeshbabu on 02/08/17.
 */
public class Rectangle {

    Point leftTop;
    int width, height;

    public Rectangle(Point p, int w, int h){
        leftTop = p;
        width = w;
        height = h;
    }

    public boolean moveUp(){
        if(leftTop.y > 100){
            leftTop.y --;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean moveDown(){
        if(leftTop.y < 350){
            leftTop.y ++;
            return true;
        } else {
            return false;
        }
    }
}
