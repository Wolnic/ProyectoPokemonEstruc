package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import modelo.Entrenador;
import modelo.ListaEntrenadores;
import modelo.NodoListaEntrenador;
import modelo.NodoTorneo;

/**
 * @author 
 * Ocampo Pantoja José Mario
 * Sánchez Venegas Manuel Antonio
 * Delgado Jiménez Alexander
 * Cordoba Hernández Giovanny Josué
 * Pérez Rodríguez Carlos Roberto
 */
public class TorneoController implements Initializable {

    private ListaEntrenadores entrenadores;
    private NodoTorneo raiz;
    private int rondaActual = 0;

    @FXML private Label lblP1, lblP2, lblP3, lblP4; // Continuar hasta lblP18
    @FXML private Button btnSiguiente;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generarEntrenadores();
        mezclarEntrenadores(); // shuffle manual sin java.util
        construirArbolTorneo();
        mostrarParticipantes();
        btnSiguiente.setOnAction(e -> avanzarTorneo());
    }

    private void generarEntrenadores() {
        entrenadores = new ListaEntrenadores();

        String[] nombresCPU = {
            "Ash", "Misty", "Brock", "Gary", "May", "Dawn", "Iris", "Cilan",
            "Serena", "Clemont", "Lana", "Kiawe", "Goh", "Chloe", "James", "Jessie", "Giovanni"
        };

        for (String nombre : nombresCPU) {
            entrenadores.agregarFinal(new Entrenador(nombre, false));
        }

        entrenadores.agregarFinal(new Entrenador("TÚ", true));
    }

    private void mezclarEntrenadores() {
        int tamaño = entrenadores.getTamaño();
        for (int i = 0; i < tamaño; i++) {
            int j = (int) (Math.random() * tamaño);

            NodoListaEntrenador n1 = entrenadores.getCabeza();
            for (int k = 0; k < i; k++) n1 = n1.getSiguiente();

            NodoListaEntrenador n2 = entrenadores.getCabeza();
            for (int k = 0; k < j; k++) n2 = n2.getSiguiente();

            Entrenador temp = n1.getEntrenador();
            n1.setEntrenador(n2.getEntrenador());
            n2.setEntrenador(temp);
        }
    }

    private void construirArbolTorneo() {
        NodoListaEntrenador actual = entrenadores.getCabeza();
        NodoTorneo[] nodos = new NodoTorneo[entrenadores.getTamaño()];
        int i = 0;
        while (actual != null) {
            nodos[i++] = new NodoTorneo(actual.getEntrenador());
            actual = actual.getSiguiente();
        }

        int tamaño = i;

        // Preliminar: reducir a 16 nodos
        while (tamaño > 16) {
            NodoTorneo n1 = nodos[--tamaño];
            NodoTorneo n2 = nodos[--tamaño];
            Entrenador ganador = Math.random() > 0.5 ? n1.getEntrenador() : n2.getEntrenador();
            nodos[tamaño++] = new NodoTorneo(ganador);
        }

        // Construcción del árbol
        while (tamaño > 1) {
            int nuevoTamaño = 0;
            NodoTorneo[] siguienteRonda = new NodoTorneo[tamaño / 2];
            for (int j = 0; j < tamaño; j += 2) {
                NodoTorneo padre = new NodoTorneo(null);
                padre.setIzquierda(nodos[j]);
                padre.setDerecha(nodos[j + 1]);
                siguienteRonda[nuevoTamaño++] = padre;
            }
            nodos = siguienteRonda;
            tamaño = nuevoTamaño;
        }

        raiz = nodos[0];
    }

    private void mostrarParticipantes() {
        if (entrenadores
