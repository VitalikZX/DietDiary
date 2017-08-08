package org.dietdiary.www;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        primaryStage.setTitle("Мой днювник..");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 1200, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
