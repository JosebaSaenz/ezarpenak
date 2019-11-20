package ehu.isad.controller.ui;

import ehu.isad.controller.db.DBKudeatzaile;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;
import main.java.ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import ehu.isad.controller.db.DBKudeatzaile;
import ehu.isad.model.Ordezkaritza;

import java.io.File;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UI4Kud implements Initializable {

    // Reference to the main application.
    private Main mainApp;

    private ImageView bandera;
    private TextArea mezua;
    private AnchorPane panela;

    private TableColumn<Ordezkaritza, String> herrialdea;
    private TableColumn<Ordezkaritza, String> artista;
    private TableColumn<Ordezkaritza, String> abestia;
    private ObservableList<Ordezkaritza> zerrenda;

    public void setMainApp(Main main) {
        this.mainApp = mainApp;
    }

    @FXML
    public void onClick(ActionEvent actionEvent) {
        // TODO Bozkatutakoa datu basean gorde eta Top3-a kalkulatu
        // TODO "Ordezkaritza" taulan bozkaketak "puntuak" zutabera
        // TODO "Bozkaketa" taulako "puntuak" zutabeko balioak ere gehitu "Ordezkaritza"-n
        //DBKudeatzaile.getInstantzia().execSQL();
        mainApp.UI5Erakutsi();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void hasieratu(String herrialde) throws SQLException {
        bandera.setImage(new Image("banderak" + File.pathSeparatorChar + herrialde.toLowerCase() + ".png"));
        mezua.setText(herrialde + "k horrela nahi ditu bere puntuak banatu:");

        TableView<Ordezkaritza> table = new TableView<Ordezkaritza>();

        table.setEditable(true);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        zutabeakPrestatu(table);

        // Display row data
        zerrenda = getOrdezkaritzak();
        table.setItems(zerrenda);

        // taula panelan sartu
        panela.getChildren().add(table);
    }

    private void zutabeakPrestatu(TableView<Ordezkaritza> table) {

        herrialdea = new TableColumn<Ordezkaritza, String>("Herrialdea");
        artista = new TableColumn<Ordezkaritza, String>("Artista");
        abestia = new TableColumn<Ordezkaritza, String>("Abestia");
        table.getColumns().addAll(herrialdea, artista, abestia);

        // Nola bistaratu gelaxkak (zutabearen arabera)
        // Get value from property of UserAccount.
        herrialdea.setCellValueFactory(new PropertyValueFactory<>("Herrialdea"));
        artista.setCellValueFactory(new PropertyValueFactory<>("Artista"));
        abestia.setCellValueFactory(new PropertyValueFactory<>("Abestia"));
    }

    private ObservableList<Ordezkaritza> getOrdezkaritzak() throws SQLException { //TODO datu-basetik ordezkaritzak lortu

        ResultSet rs = DBKudeatzaile.getInstantzia().execSQL("Select herrialdea, artista, abestia from Ordezkaritza");
        ObservableList<Ordezkaritza> list = FXCollections.observableArrayList();

        while(rs.next()){
            String herrialdea = rs.getString("herrialdea");
            String artista = rs.getString("artista");
            String abestia = rs.getString("abestia");
            Ordezkaritza o = new Ordezkaritza(herrialdea,artista,abestia);
            list.add(o);
        }

        return list;
    }

}