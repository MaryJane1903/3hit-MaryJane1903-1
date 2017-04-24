package com.company;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch();

    }

    private void showDialog(Window owner, Modality modality){
        Stage stage = new Stage();
        stage.initOwner(owner);
        stage.initModality(modality);

        Label modalityLabel = new Label(modality.toString());
        Button closebutton = new Button("Close");
        closebutton.setOnAction(e -> stage.close());

        VBox root = new VBox();
        root.getChildren().addAll(modalityLabel, closebutton);

        Scene scene = new Scene(root,100,100);
        stage.setScene(scene);
        stage.setTitle("A Box");
        stage.show();
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Buttons mit Modaility");



        Button ownedNoneButton = new Button("Owned None");
        ownedNoneButton.setOnAction(e -> showDialog(stage,Modality.NONE));

        Button nonOwnedNoneButton = new Button("Non-Owned None");
        nonOwnedNoneButton.setOnAction(e -> showDialog(null,Modality.NONE));

        Button ownedWindowModalButton = new Button("Owned Window Modal");
        ownedWindowModalButton.setOnAction(e -> showDialog(stage,Modality.WINDOW_MODAL));

        Button nonOwnedWindowModalButton = new Button("Non-Owned Window Modal");
        nonOwnedWindowModalButton.setOnAction(e -> showDialog(null,Modality.WINDOW_MODAL));

        Button ownedApplicationModalButton = new Button("Owned Applicaton Modal");
        ownedApplicationModalButton.setOnAction(e -> showDialog(stage,Modality.APPLICATION_MODAL));

        Button nonOwnedApplicationModalButton = new Button("Non-Owned Applicaton Modal");
        nonOwnedApplicationModalButton.setOnAction(e -> showDialog(null,Modality.APPLICATION_MODAL));

        VBox root = new VBox();
        root.getChildren().addAll(ownedNoneButton,
                                    nonOwnedNoneButton,
                                    ownedWindowModalButton,
                                    nonOwnedWindowModalButton,
                                    ownedApplicationModalButton,
                                    nonOwnedApplicationModalButton);
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

}
