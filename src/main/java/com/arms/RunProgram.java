package com.arms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunProgram extends Application {

    public void start(Stage stage) throws Exception {
        // Create a new blank content for the window to be used.
        Scene scene = new Scene(new ViewItem(), 1280, 720);
        stage.setTitle("test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
