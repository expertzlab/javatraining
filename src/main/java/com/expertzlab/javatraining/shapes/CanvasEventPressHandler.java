package com.expertzlab.javatraining.shapes;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class CanvasEventPressHandler implements EventHandler<MouseEvent> {


    GraphicsContext gc;

    CanvasEventPressHandler(GraphicsContext gc){
        this.gc = gc;
    }

    @Override
    public void handle(MouseEvent event) {

        System.out.println("Mouse Event ditected PRESSED");
        gc.moveTo(event.getX(),event.getY());
        ControlPanel.start = new Point2D(event.getX(),event.getY());
    }


}
