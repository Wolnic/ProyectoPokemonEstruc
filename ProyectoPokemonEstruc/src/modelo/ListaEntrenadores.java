/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JUser
 */
public class ListaEntrenadores {
    private Entrenador[] entrenadores = {
        new Entrenador("Ash"),
        new Entrenador("Misty"),
        new Entrenador("Brock"),
        new Entrenador("Gary"),
        new Entrenador("May"),
        new Entrenador("Dawn"),
        new Entrenador("Iris"),
        new Entrenador("Serena"),
        new Entrenador("Kiawe"),
        new Entrenador("Giovanni")
    };

    public Entrenador[] getEntrenadores() {
        return entrenadores;
    }

    public Entrenador[] obtenerOponentes(String nombreSeleccionado, int cantidad) {
        Entrenador[] resultado = new Entrenador[cantidad];
        int index = 0;

        for (int i = 0; i < entrenadores.length && index < cantidad; i++) {
            if (!entrenadores[i].getNombre().equals(nombreSeleccionado)) {
                // Algoritmo simple sin java.util.Random
                int hash = (entrenadores[i].getNombre().length() * (i + 7)) % 3;
                if (hash != 0) {
                    resultado[index++] = entrenadores[i];
                }
            }
        }

        // Si no se llenó la cantidad, rellena con otros
        for (int i = 0; i < entrenadores.length && index < cantidad; i++) {
            if (!entrenadores[i].getNombre().equals(nombreSeleccionado) && !yaExiste(resultado, entrenadores[i], index)) {
                resultado[index++] = entrenadores[i];
            }
        }

        return resultado;
    }

    private boolean yaExiste(Entrenador[] lista, Entrenador e, int hasta) {
        for (int i = 0; i < hasta; i++) {
            if (lista[i] != null && lista[i].getNombre().equals(e.getNombre())) {
                return true;
            }
        }
        return false;
    }
}   
