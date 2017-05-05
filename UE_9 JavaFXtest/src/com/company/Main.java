package com.company;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

public class Main extends Application{

    public static void main(String[] args) {
	Application.launch();

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Stage mit Button");
    /*
        HBox test=new HBox(10);
        Label text=new Label("Name");
        TextField field=new TextField();
        Button b1=new Button("OK");
        Button b2=new Button("Cancle");
        test.getChildren().addAll(text,field,b1,b2);
        Scene scene = new Scene(test);
        primaryStage.setScene(scene);
        test.setStyle("-fx-padding: 20;");
        test.setAlignment(Pos.CENTER);
        b2.setMaxHeight(1000);
        test.setFillHeight(false);
        test.setHgrow(field, Priority.ALWAYS);
        FlowPane flo=new FlowPane();



        primaryStage.show();


    */


    /*
        VBox test=new VBox(10);
        Label text=new Label("Name");
        TextField field=new TextField();
        Button b1=new Button("OK");
        Button b2=new Button("Cancle");
        test.getChildren().addAll(text,field,b1,b2);
        Scene scene = new Scene(test);
        primaryStage.setScene(scene);
        test.setStyle("-fx-padding: 20;");
        test.setAlignment(Pos.CENTER);
        b2.setMaxHeight(1000);
        test.setFillWidth(false);
        test.setVgrow(field, Priority.ALWAYS);
        primaryStage.show();
    */


        FlowPane flo=new FlowPane();
        for(int i=1;i<=10;i++) {
            flo.getChildren().add(new Button("Button" + i));
        }
            Scene scene = new Scene(flo);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }

