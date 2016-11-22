package com.expertzlab.javatraining.shapes;

import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class CanvasEventReleaseHandler implements EventHandler<MouseEvent> {

    GraphicsContext gc;
    public static ShapeBase.Color color = new ShapeBase.Color();

    CanvasEventReleaseHandler(GraphicsContext gc){
        this.gc = gc;
    }

    @Override
    public void handle(MouseEvent event) {


        if(ControlPanel.selectedShape == Shape.RECTANGLE ){
            System.out.println("Mouse Event ditected RELEASED");
            gc.setStroke(Color.color(color.m_red,color.m_green, color.m_blue));
            gc.strokeRect(ControlPanel.start.getX(),ControlPanel.start.getY(),
                    event.getX()-ControlPanel.start.getX(),event.getY()-ControlPanel.start.getY());

        }

        if(ControlPanel.selectedShape == Shape.LINE ){
            System.out.println("Mouse Event ditected RELEASED");
            gc.setStroke(Color.color(color.m_red,color.m_green, color.m_blue));
            gc.strokeLine(ControlPanel.start.getX(),ControlPanel.start.getY(),event.getX(),event.getY());
        }
    }
}
