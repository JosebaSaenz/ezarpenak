package main.java.ehu.isad.controller.ui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.java.ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class UI3Kud implements Initializable {

    // Reference to the main application.
    private Main mainApp;
    private ImageView bandera;
    private TextArea mezua;

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
        bandera.setImage(new Image("banderak" + File.pathSeparatorChar + herrialde.toLowerCase() + ".png"));
        mezua.setText(herrialde + "k jada banatu ditu bere puntuak.");
    }
}