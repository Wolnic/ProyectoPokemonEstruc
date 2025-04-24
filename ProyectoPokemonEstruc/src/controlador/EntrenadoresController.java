/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author josem
 */
public class EntrenadoresController implements Initializable {

    @FXML
    private ScrollPane scrEntrenadores;
    @FXML
    private AnchorPane anpFrame;
    @FXML
    private StackPane stpAsh;
    @FXML
    private ImageView imgAsh;
    @FXML
    private Label lblAsh;
    @FXML
    private AnchorPane anpAshDetails;
    @FXML
    private StackPane stpMisty;
    @FXML
    private ImageView imgMisty;
    @FXML
    private Label lblMisty;
    @FXML
    private StackPane stpBrock;
    @FXML
    private ImageView imgBrock;
    @FXML
    private Label lblBrock;
    @FXML
    private StackPane stpGary;
    @FXML
    private ImageView imgGary;
    @FXML
    private Label lblGary;
    @FXML
    private StackPane stpMay;
    @FXML
    private ImageView imgMay;
    @FXML
    private Label lblMay;
    @FXML
    private StackPane stpDawn;
    @FXML
    private ImageView imgDawn;
    @FXML
    private Label lblDawn;
    @FXML
    private StackPane stpIris;
    @FXML
    private ImageView imgIris;
    @FXML
    private Label lblIris;
    @FXML
    private StackPane stpSerena;
    @FXML
    private ImageView imgSerena;
    @FXML
    private Label lblSerena;
    @FXML
    private StackPane stpKiawe;
    @FXML
    private ImageView imgKiawe;
    @FXML
    private Label lblKiawe;
    @FXML
    private StackPane stpGiovanni;
    @FXML
    private ImageView imgGiovanni;
    @FXML
    private Label lblGiovanni;
    @FXML
    private AnchorPane anpMistyDetails;
    @FXML
    private AnchorPane anpBrockDetails;
    @FXML
    private AnchorPane anpGaryDetails;
    @FXML
    private AnchorPane anpMayDetails;
    @FXML
    private AnchorPane anpDawnDetails;
    @FXML
    private AnchorPane anpIrisDetails;
    @FXML
    private AnchorPane anpSerenaDetails;
    @FXML
    private AnchorPane anpKiaweDetails;
    @FXML
    private AnchorPane anpGiovanniDetails;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void hideAshDetails(MouseEvent event) {
        anpAshDetails.setVisible(false);
    }

    @FXML
    private void showAshDetails(MouseEvent event) {
        anpAshDetails.setVisible(true);
    }

    @FXML
    private void hideMistyDetails(MouseEvent event) {
        anpMistyDetails.setVisible(false);
    }

    @FXML
    private void showMistyDetails(MouseEvent event) {
        anpMistyDetails.setVisible(true);
    }

    @FXML
    private void hideBrockDetails(MouseEvent event) {
        anpBrockDetails.setVisible(false);
    }

    @FXML
    private void showBrockDetails(MouseEvent event) {
        anpBrockDetails.setVisible(true);
    }

    @FXML
    private void hideGaryDetails(MouseEvent event) {
        anpGaryDetails.setVisible(false);
    }

    @FXML
    private void showGaryDetails(MouseEvent event) {
        anpGaryDetails.setVisible(true);
    }

    @FXML
    private void hideMayDetails(MouseEvent event) {
        anpMayDetails.setVisible(false);
    }

    @FXML
    private void showMayDetails(MouseEvent event) {
        anpMayDetails.setVisible(true);
    }

    @FXML
    private void hideDawnDetails(MouseEvent event) {
        anpDawnDetails.setVisible(false);
    }

    @FXML
    private void showDawnDetails(MouseEvent event) {
        anpDawnDetails.setVisible(true);
    }

    @FXML
    private void hideIrisDetails(MouseEvent event) {
        anpIrisDetails.setVisible(false);
    }

    @FXML
    private void showIrisDetails(MouseEvent event) {
        anpIrisDetails.setVisible(true);
    }

    @FXML
    private void hideSerenaDetails(MouseEvent event) {
        anpSerenaDetails.setVisible(false);
    }

    @FXML
    private void showSerenaDetails(MouseEvent event) {
        anpSerenaDetails.setVisible(true);
    }

    @FXML
    private void hideKiaweDetails(MouseEvent event) {
        anpKiaweDetails.setVisible(false);
    }

    @FXML
    private void showKiaweDetails(MouseEvent event) {
        anpKiaweDetails.setVisible(true);
    }

    @FXML
    private void hideGiovanniDetails(MouseEvent event) {
        anpGiovanniDetails.setVisible(false);
    }

    @FXML
    private void showGiovanniDetails(MouseEvent event) {
        anpGiovanniDetails.setVisible(true);
    }

  private String entrenadorSeleccionado;

    @FXML
    private void handleAshClick(MouseEvent event) {
        entrenadorSeleccionado = "Ash";
        mostrarMensaje("Seleccionaste a Ash");
    }

    @FXML
    private void handleMistyClick(MouseEvent event) {
        entrenadorSeleccionado = "Misty";
        mostrarMensaje("Seleccionaste a Misty");
    }

    @FXML
    private void handleBrockClick(MouseEvent event) {
        entrenadorSeleccionado = "Brock";
        mostrarMensaje("Seleccionaste a Brock");
    }

    @FXML
    private void handleGaryClick(MouseEvent event) {
        entrenadorSeleccionado = "Gary";
        mostrarMensaje("Seleccionaste a Gary");
    }

    @FXML
    private void handleMayClick(MouseEvent event) {
        entrenadorSeleccionado = "May";
        mostrarMensaje("Seleccionaste a May");
    }

    @FXML
    private void handleDawnClick(MouseEvent event) {
        entrenadorSeleccionado = "Dawn";
        mostrarMensaje("Seleccionaste a Dawn");
    }

    @FXML
    private void handleIrisClick(MouseEvent event) {
        entrenadorSeleccionado = "Iris";
        mostrarMensaje("Seleccionaste a Iris");
    }

    @FXML
    private void handleSerenaClick(MouseEvent event) {
        entrenadorSeleccionado = "Serena";
        mostrarMensaje("Seleccionaste a Serena");
    }

    @FXML
    private void handleKiaweClick(MouseEvent event) {
        entrenadorSeleccionado = "Kiawe";
        mostrarMensaje("Seleccionaste a Kiawe");
    }

    @FXML
    private void handleGiovanniClick(MouseEvent event) {
        entrenadorSeleccionado = "Giovanni";
        mostrarMensaje("Seleccionaste a Giovanni");
    }


    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(AlertType.INFORMATION, mensaje, ButtonType.OK);
        alert.setTitle("Selección de Entrenador");
        alert.setHeaderText(null);  // No necesitamos encabezado
        alert.showAndWait();
    }

    @FXML
    private void handleElegirEntrenador(ActionEvent event) {
        if (entrenadorSeleccionado != null) {
            // Abrir CartasVista.fxml
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CartasVista.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Vista del Pokémon");
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            mostrarMensaje("No se ha seleccionado ningún entrenador.");
        }
    }
}

