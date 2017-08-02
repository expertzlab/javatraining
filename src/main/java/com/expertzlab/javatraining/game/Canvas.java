package com.expertzlab.javatraining.game;

/**
 * Created by gireeshbabu on 02/08/17.
 */
public class Canvas {

    Point leftTop;
    int width, height, count;
    Rectangle r;

    public Canvas(Point p, Rectangle r, int w, int h, int c){
        leftTop = p;
        width = w;
        height = h;
        count = c;
        this.r = r;
    }

    public void start() throws InterruptedException {

        while (count > 0){
            while (r.moveUp()){
                System.out.printf("Movi Up:x-%d,y-%d\n",r.leftTop.x, r.leftTop.y);
                Thread.sleep(50l);
            }
            while (r.moveDown()){
                System.out.printf("Moving Down:x-%d,y-%d\n",r.leftTop.x, r.leftTop.y);
                Thread.sleep(50l);
            }
            count --;
        }
    }

}
