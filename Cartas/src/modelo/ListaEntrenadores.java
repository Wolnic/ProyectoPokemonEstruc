/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class ListaEntrenadores {
    private NodoListaEntrenador cabeza;
    private int tamaño;

    public ListaEntrenadores() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public void agregarFinal(Entrenador entrenador) {
        NodoListaEntrenador nuevo = new NodoListaEntrenador(entrenador);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoListaEntrenador actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public Entrenador obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        NodoListaEntrenador actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getEntrenador();
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public NodoListaEntrenador getCabeza() {
        return cabeza;
    }
}
