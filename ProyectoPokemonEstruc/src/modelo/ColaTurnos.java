/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Manu
 */
public class ColaTurnos {
    private NodoTurno frente;
    private NodoTurno fin;
    

    public void encolar(String jugador) {
        NodoTurno nuevo = new NodoTurno(jugador);
        if (fin != null) {
            fin.setSiguiente(nuevo);
        } else {
            frente = nuevo;
        }
        fin = nuevo;
    }

    public String desencolar() {
        if (frente == null) return null;
        String jugador = frente.getJugador();
        frente = frente.getSiguiente();
        if (frente == null) fin = null;
        return jugador;
    }

    public boolean esVacia() {
        return frente == null;
    }
}
