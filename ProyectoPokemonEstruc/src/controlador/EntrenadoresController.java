/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.awt.Insets;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

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

    @FXML
private Pane cartaSeleccionada;

private String entrenadorSeleccionado = null;

    @FXML
    private void handleAshClick(MouseEvent event) {
        seleccionarEntrenador("Ash", event);
    }

    @FXML
    private void handleMistyClick(MouseEvent event) {
        seleccionarEntrenador("Misty", event);
    }

    @FXML
    private void handleBrockClick(MouseEvent event) {
        seleccionarEntrenador("Brock", event);
    }

    @FXML
    private void handleGaryClick(MouseEvent event) {
        seleccionarEntrenador("Gary", event);
    }

    @FXML
    private void handleMayClick(MouseEvent event) {
        seleccionarEntrenador("May", event);
    }

    @FXML
    private void handleDawnClick(MouseEvent event) {
        seleccionarEntrenador("Dawn", event);
    }

    @FXML
    private void handleIrisClick(MouseEvent event) {
        seleccionarEntrenador("Iris", event);
    }

    @FXML
    private void handleSerenaClick(MouseEvent event) {
        seleccionarEntrenador("Serena", event);
    }

    @FXML
    private void handleKiaweClick(MouseEvent event) {
        seleccionarEntrenador("Kiawe", event);
    }

    @FXML
    private void handleGiovanniClick(MouseEvent event) {
        seleccionarEntrenador("Giovanni", event);
    }

@FXML
private void handleElegirEntrenador(ActionEvent event) {
    if (entrenadorSeleccionado != null) {
        mostrarMensajeBonitoTemporal("¡Has elegido a " + entrenadorSeleccionado + "!", 3000, () -> {
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
        });
    } else {
        mostrarMensaje("No se ha seleccionado ningún entrenador.");
    }
}

private void seleccionarEntrenador(String nombreEntrenador, MouseEvent event) {
    Node source = (Node) event.getSource();
    Pane carta = (Pane) source;

    if (cartaSeleccionada != null) {
        cartaSeleccionada.setStyle("");
    }

    carta.setStyle("-fx-border-color: gold; -fx-border-width: 4px; -fx-border-radius: 15px;");
    cartaSeleccionada = carta;
    entrenadorSeleccionado = nombreEntrenador;
}

private void mostrarMensaje(String mensaje) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION, mensaje, ButtonType.OK);
    alert.setTitle("Selección de Entrenador");
    alert.setHeaderText(null);
    alert.showAndWait();
}

private void mostrarMensajeBonitoTemporal(String mensaje, int milisegundos, Runnable onClose) {
    Label label = new Label(mensaje);
    label.setStyle("-fx-font-size: 16px; -fx-text-fill: white; -fx-padding: 20px; -fx-font-family: 'Arial Rounded MT Bold';");

    StackPane root = new StackPane(label);
    root.setStyle("-fx-background-color: rgba(50,50,50,0.85); -fx-background-radius: 15px;");
    root.setStyle("-fx-background-color: rgba(50,50,50,0.85); -fx-background-radius: 15px; -fx-padding: 20px;");

    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.initStyle(StageStyle.TRANSPARENT);
    stage.setScene(scene);
    stage.setAlwaysOnTop(true);
    stage.show();

    PauseTransition delay = new PauseTransition(Duration.millis(milisegundos));
    delay.setOnFinished(e -> {
        stage.close();
        if (onClose != null) onClose.run();
    });
    delay.play();
}

}