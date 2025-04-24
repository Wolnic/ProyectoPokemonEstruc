/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Manu
 */
public class NodoTurno {
    private String jugador;
    private NodoTurno siguiente;

    public NodoTurno(String jugador) {
        this.jugador = jugador;
        this.siguiente=null;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public NodoTurno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTurno siguiente) {
        this.siguiente = siguiente;
    }
}
