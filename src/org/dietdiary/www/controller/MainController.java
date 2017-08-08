package org.dietdiary.www.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public void showAboutIt(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../view/aboutIt.fxml"));
            Stage stage = new Stage();
            stage.setTitle("О программе..");
            stage.setResizable(false);
            stage.setScene(new Scene(root, 90, 325));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
