package com.expertzlab.javatraining.shapes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class ControlPanel extends GridPane {

    final Button rectangle;
    final Button line;
    public static TextField red;
    public static TextField green;
    public static TextField blue;

    public static Shape selectedShape;
    public static Point2D start;


   ControlPanel(){
       rectangle = new Button("Rectangle");
       line = new Button("Line");

       red = new TextField();
       green = new TextField();
       blue = new TextField();

       selectedShape = Shape.LINE;
       addButtons();
       setOnActions();
    }

    public void addButtons(){
        this.add(rectangle,1,1);
        this.add(line,1,2);
        this.add(red,1,3);
        this.add(green,2,3);
        this.add(blue,3,3);
    }

    public void setOnActions(){

        System.out.println("Actions has been Set");

        rectangle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Drawing rectangle");
                selectedShape = Shape.RECTANGLE;

            }
        });

        line.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Drawing Line");
                selectedShape = Shape.LINE;
            }
        });

        red.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                ShapeBase.Color oldColor  = CanvasEventReleaseHandler.color;
                CanvasEventReleaseHandler.color = new ShapeBase.Color(Float.valueOf( event.getText()),
                       oldColor.m_green, oldColor.m_blue );
            }
        });

        green.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                ShapeBase.Color oldColor  = CanvasEventReleaseHandler.color;
                CanvasEventReleaseHandler.color = new ShapeBase.Color(oldColor.m_red,Float.valueOf( event.getText()),
                        oldColor.m_blue );
            }
        });

        blue.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                ShapeBase.Color oldColor  = CanvasEventReleaseHandler.color;
                CanvasEventReleaseHandler.color = new ShapeBase.Color(oldColor.m_red, oldColor.m_green,
                        Float.valueOf( event.getText()));
            }
        });
    }

}
