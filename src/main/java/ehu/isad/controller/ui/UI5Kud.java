package main.java.ehu.isad.controller.ui;

import main.java.ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class UI5Kud implements Initializable {

    // Reference to the main application.
    private Main mainApp;

    public void setMainApp(Main main) {
        this.mainApp = mainApp;
    }

    @FXML
    public void onClick(ActionEvent actionEvent) {
        mainApp.UI2Erakutsi();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void hasieratu(String herrialde){

    }
}