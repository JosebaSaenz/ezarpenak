package main.java.ehu.isad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.ehu.isad.controller.ui.UI3Kud;

import java.io.IOException;

public class Main extends Application {

  private Parent UI1;
  private Parent UI2;
  private Parent UI3;
  private Parent UI4;
  private Parent UI5;

  private Stage stage;

  private main.java.ehu.isad.controller.ui.UI1Kud UI1Kud;
  private main.java.ehu.isad.controller.ui.UI2Kud UI2Kud;
  private main.java.ehu.isad.controller.ui.UI2Kud UI3Kud;
  private main.java.ehu.isad.controller.ui.UI2Kud UI4Kud;
  private main.java.ehu.isad.controller.ui.UI2Kud UI5Kud;


  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("EUROBISIOA");
    stage.setScene(new Scene(UI1, 271, 204));
    stage.show();
  }

  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderUI1 = new FXMLLoader(getClass().getResource("/UI1.fxml"));
    UI1 = (Parent) loaderUI1.load();
    UI1Kud = loaderUI1.getController();
    UI1Kud.setMainApp(this);

    FXMLLoader loaderUI2 = new FXMLLoader(getClass().getResource("/UI2.fxml"));
    UI2 = (Parent) loaderUI2.load();
    UI2Kud = loaderUI2.getController();
    UI2Kud.setMainApp(this);

    FXMLLoader loaderUI3 = new FXMLLoader(getClass().getResource("/UI3.fxml"));
    UI3 = (Parent) loaderUI3.load();
    UI3Kud = loaderUI3.getController();
    UI3Kud.setMainApp(this);

    FXMLLoader loaderUI4 = new FXMLLoader(getClass().getResource("/UI4.fxml"));
    UI4 = (Parent) loaderUI4.load();
    UI4Kud = loaderUI4.getController();
    UI4Kud.setMainApp(this);

    FXMLLoader loaderUI5 = new FXMLLoader(getClass().getResource("/UI5.fxml"));
    UI5 = (Parent) loaderUI5.load();
    UI5Kud = loaderUI5.getController();
    UI5Kud.setMainApp(this);
  }


  public static void main(String[] args) {
    launch(args);
  }

  public void UI2Erakutsi() {
    stage.setScene(new Scene(UI2));
    stage.setTitle("Informazioaren eguneraketa");
    UI2Kud.comboboxHasieratu();
    stage.show();
  }

  public void UI3Erakutsi(String herrialde) {
    stage.setScene(new Scene(UI3));
    stage.setTitle(herrialde + "ren buruzko informazioa");
    UI3Kud.hasieratu(herrialde);
    stage.show();
  }

  public void UI4Erakutsi(String herrialdea) {
    stage.setScene(new Scene(UI4));
    stage.setTitle("Bozkaketa panela");
    UI4Kud.hasieratu(herrialdea);
    stage.show();
  }

  public void UI5Erakutsi() {
    stage.setScene(new Scene(UI5));
    stage.setTitle("TOP 3");
    stage.show();
  }
}
