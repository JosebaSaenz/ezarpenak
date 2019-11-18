package ehu.isad.controller.ui;

import ehu.isad.Main;
import ehu.isad.controller.db.EzarpenakDBKud;
import ehu.isad.model.Ezarpena;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class EzarpenakKud implements Initializable {

  // Reference to the main application.
  private Main mainApp;

  @FXML
  private TextArea ezarpenak;

  public void setMainApp(Main main) {
    this.mainApp = mainApp;
  }

  @FXML
  public void onClick(ActionEvent actionEvent) {

  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

  public void getEzarpenak(){
    List<Ezarpena> zerrenda = EzarpenakDBKud.getInstantzia().lortuEzarpenak();
    ezarpenak.setText(zerrenda.toString());
  }

}