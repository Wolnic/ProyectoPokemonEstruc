/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 */

public class BatallaPokemonController implements Initializable {

    @FXML
    private ImageView imgFondoSelected;
    @FXML
    private TextArea txtAreaMensajes;
    @FXML
    private Button btnCambiar;
    @FXML
    private Button btnDefensaEspecial;
    @FXML
    private Button btnDefender;
    @FXML
    private Button btnAtaqueEspecial;
    @FXML
    private Button btnAtacar;
    @FXML
    private ProgressBar barVidaJugador;
    @FXML
    private Label lblNombreJugador;
    @FXML
    private ProgressBar barVidaCPU;
    @FXML
    private Label lblNombreCPU;
    @FXML
    private ImageView imgCPU;
    @FXML
    private ImageView imgJugador;
    @FXML
    private Label lblHpJugador;
    @FXML
    private Label lblHpCPU;

   
    private int hpJugador = 150;
    private int hpCPU = 150;
    private final int hpMaximo = 150;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        actualizarHpJugador();
        actualizarHpCPU();
    }

    private void actualizarHpJugador() {
        lblHpJugador.setText(hpJugador + " / " + hpMaximo + " HP");
        barVidaJugador.setProgress((double) hpJugador / hpMaximo);
    }

    private void actualizarHpCPU() {
        lblHpCPU.setText(hpCPU + " / " + hpMaximo + " HP");
        barVidaCPU.setProgress((double) hpCPU / hpMaximo);
    }

    @FXML
    private void cambiar(ActionEvent event) {
        txtAreaMensajes.appendText("Has cambiado de Pokémon.\n");
    }

    @FXML
    private void defensaEspecial(ActionEvent event) {
        txtAreaMensajes.appendText("Usaste Defensa Especial.\n");
    }

    @FXML
    private void defender(ActionEvent event) {
        txtAreaMensajes.appendText("Usaste Defensa.\n");
    }

    @FXML
    private void ataqueEspecial(ActionEvent event) {
        int daño = 30;
        hpCPU = Math.max(hpCPU - daño, 0);
        actualizarHpCPU();
        txtAreaMensajes.appendText("¡Ataque Especial! Hiciste " + daño + " de daño.\n");
    }

    @FXML
    private void atacar(ActionEvent event) {
        int daño = 20;
        hpCPU = Math.max(hpCPU - daño, 0);
        actualizarHpCPU();
        txtAreaMensajes.appendText("¡Ataque normal! Hiciste " + daño + " de daño.\n");
    }
}
