/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUser
 */
public class TorneoController implements Initializable {

    @FXML
    private Button btnSiguiente;
    @FXML
    private VBox boxParticipantesIzq;
    @FXML
    private Label lblP1;
    @FXML
    private Label lblP2;
    @FXML
    private Label lblP3;
    @FXML
    private Label lblP4;
    @FXML
    private VBox boxSemisIzq;
    @FXML
    private Label lblSemi1;
    @FXML
    private Label lblSemi2;
    @FXML
    private Label lblFinal2;
    @FXML
    private VBox boxParticipantesIDer;
    @FXML
    private Label lblP5;
    @FXML
    private Label lblP6;
    @FXML
    private Label lblP7;
    @FXML
    private Label lblP8;
    @FXML
    private Label lblGanador;
    @FXML
    private VBox boxSemisDer;
    @FXML
    private Label lblSemi3;
    @FXML
    private Label lblSemi4;
    @FXML
    private Label lblFinal1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void JugarRonda(MouseEvent event) {
        try {
        // Cargar el archivo FXML desde la carpeta vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/BatallaPokemon.fxml"));
        Parent root = loader.load();

        // Obtener el escenario actual desde el evento
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        // Cambiar la escena
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
}
