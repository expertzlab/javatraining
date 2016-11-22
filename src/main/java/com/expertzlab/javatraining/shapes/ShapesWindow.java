package com.expertzlab.javatraining.shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 * Created by gireeshbabu on 20/11/16.
 */
public class ShapesWindow extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(450, 250);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        ControlPanel cPanel = new ControlPanel();

        canvas.setOnMousePressed(new CanvasEventPressHandler(gc));
        canvas.setOnMouseReleased(new CanvasEventReleaseHandler(gc));
        root.getChildren().add(canvas);
        root.getChildren().add(cPanel);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
