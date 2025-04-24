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
import modelo.ListaPokemon;
import modelo.Pokemon;

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
    
    private ListaPokemon equipoJugador;
    private int rondaActual = 1;

    /**
     * Initializes the controller class.
     */
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        equipoJugador = new ListaPokemon();
    }

    public void recibirPokemones(Pokemon[] pokemones) {
    for (Pokemon p : pokemones) {
        if (p != null) {
            equipoJugador.agregarPokemon(p);
        }
    }
    actualizarVistaTorneo();
}

    private void actualizarVistaTorneo() {
        if (equipoJugador.getCantidad() >= 4) {
            lblP1.setText(equipoJugador.obtenerPokemon(0).getNombre());
            lblP2.setText(equipoJugador.obtenerPokemon(1).getNombre());
            lblP3.setText(equipoJugador.obtenerPokemon(2).getNombre());
            lblP4.setText(equipoJugador.obtenerPokemon(3).getNombre());
            lblP5.setText("CPU1");
            lblP6.setText("CPU2");
            lblP7.setText("CPU3");
            lblP8.setText("CPU4");
        }
    }

    @FXML
    private void JugarRonda(MouseEvent event) {
        switch (rondaActual) {
            case 1:
                lblSemi1.setText(lblP1.getText());
                lblSemi2.setText(lblP3.getText());
                lblSemi3.setText(lblP5.getText());
                lblSemi4.setText(lblP7.getText());
                break;
            case 2:
                lblFinal1.setText(lblSemi1.getText());
                lblFinal2.setText(lblSemi3.getText());
                break;
            case 3:
                lblGanador.setText(lblFinal1.getText());
                break;
        }
        rondaActual++;

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/BatallaPokemon.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Pokemon crearPokemonPorNombre(String nombre) {
        switch (nombre) {
            case "Charizard": return new Pokemon("Charizard", "Fuego", 1);
            case "Blaziken": return new Pokemon("Blaziken", "Fuego", 2);
            case "Volcarona": return new Pokemon("Volcarona", "Fuego", 3);
            case "Greninja": return new Pokemon("Greninja", "Agua", 4);
            case "Empoleon": return new Pokemon("Empoleon", "Agua", 5);
            case "Cloyster": return new Pokemon("Cloyster", "Agua", 6);
            case "Snorlax": return new Pokemon("Snorlax", "Normal", 7);
            case "Mewtwo": return new Pokemon("Mewtwo", "Psíquico", 8);
            case "Staraptor": return new Pokemon("Staraptor", "Normal", 9);
            case "Bulbasaur": return new Pokemon("Bulbasaur", "Planta", 10);
            case "Arcanine": return new Pokemon("Arcanine", "Fuego", 11);
            case "Blastoise": return new Pokemon("Blastoise", "Agua", 12);
            default: return new Pokemon("Desconocido", "Normal", 99);
        }
    }
}