package com.company;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
	Application.launch();

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Stage mit Button");

        Group root = new Group(new Button("Hello"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.sizeToScene();
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.show();

    }
}
