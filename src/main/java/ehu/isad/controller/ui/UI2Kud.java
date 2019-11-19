package main.java.ehu.isad.controller.ui;

import main.java.ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class UI2Kud implements Initializable {

  // Reference to the main application.
  private Main mainApp;

  @FXML
  private ComboBox comboBox;


  public void setMainApp(Main main) {
    this.mainApp = mainApp;
  }

  @FXML
  public void onClick(ActionEvent actionEvent) {
    String aukera = (String) comboBox.getValue();
    /*if () { // TODO Puntuak jada banatu ditu (errorea)
        mainApp.UI3Erakutsi(aukera);
    }
    else{ // TODO Bozkaketa lehioa
        mainApp.UI4Erakutsi(aukera);
    }*/
  }

  public void comboboxHasieratu() {
    comboBox.getItems().add("Albania");
    comboBox.getItems().add("Alemania");
    comboBox.getItems().add("Austria");
    comboBox.getItems().add("Azerbaiyan");
    comboBox.getItems().add("Belgika");
    comboBox.getItems().add("Bielorrusia");
    comboBox.getItems().add("Bosnia");
    comboBox.getItems().add("Bulgaria");
    comboBox.getItems().add("Chipre");
    comboBox.setValue("Albania");
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {

  }
}