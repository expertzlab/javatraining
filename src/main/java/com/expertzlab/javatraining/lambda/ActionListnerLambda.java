package com.expertzlab.javatraining.lambda;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by gireeshbabu on 25/11/16.
 */
public class ActionListnerLambda extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(450, 250);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        String buttonName = "click Me";
        //buttonName = "Another Name";
        Button button = new Button(buttonName);
        /*
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button clicked");
            }
        });
        */

        button.setOnAction(event -> System.out.println("button clicked "+ buttonName));
        /*
        Instead of passing in an object that implements an interface, we’re passing in a block of code—a function
         without a name. event is the name of a parameter, the same parameter as in the anonymous inner class example.
          -> separates the parameter from the body of the lambda expression, which is just some code that is run
           when a user clicks our button.
         */
        GridPane pane = new GridPane();
        pane.add(button,1,1);


        root.getChildren().add(canvas);
        root.getChildren().add(pane);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


}
