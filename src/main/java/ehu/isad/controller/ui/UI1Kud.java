package main.java.ehu.isad.controller.ui;

import javafx.scene.control.ComboBox;
import main.java.ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class UI1Kud implements Initializable {

  // Reference to the main application.
  private Main mainApp;


  public void setMainApp(Main main) {
    this.mainApp = main;
  }

  @FXML
  public void onClick(ActionEvent actionEvent) {
    mainApp.UI2Erakutsi();
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

}