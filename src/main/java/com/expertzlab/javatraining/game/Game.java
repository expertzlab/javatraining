package com.expertzlab.javatraining.game;

/**
 * Created by gireeshbabu on 02/08/17.
 */
public class Game {

    public static void main(String[] args) throws InterruptedException {

        Point clT = new Point(100,100);
        Point rlT = new Point(200, 350);

        Rectangle r = new Rectangle(rlT,100, 50);
        Canvas c = new Canvas(clT,r,600,400,20);
        c.start();
    }

}
