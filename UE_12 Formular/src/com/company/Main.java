package com.company;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        primaryStage.setTitle("Formular");
        FlowPane flo=new FlowPane();
        Scene scene = new Scene(flo);
        VBox top = new VBox();
        VBox mid = new VBox();
        VBox bot = new VBox();
        flo.getChildren().addAll(top,mid,bot);
//ALLES FÜR TOP BEREICH **************************************************************************************************
        Label labeltop= new Label("HTBLA-WELS");
        final ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Höhere Abteilung");
        rb1.setToggleGroup(group);
        RadioButton rb2 = new RadioButton("Fachschule");
        rb2.setToggleGroup(group);
        Label lfür= new Label("Für");
        TextField tfür= new TextField();
        ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
                "Chemie", "Informationstechnologie", "Maschienenbau", "Mechatronik", "Elektrotechnik")
        );


















        primaryStage.setScene(scene);
        primaryStage.show();
    }
}